package GameCharacters;

import GameClock.Subject;
import Locations.Location;

public class PatrollingGuard extends Guard{

	Context ctxt;
	Patrol patrol;
	Boolean moved = false;
	
	public PatrollingGuard(String n, Subject s, Location l, Locations.Yard yard) {
		super(n, s, l, yard);
		super.inventory.remove(super.key); // patrolling guard 
		super.loc.items.remove(super.key); // remove from location as well
		super.dialogs.remove("\n[Patrolling Guard]:\n\t❝  Have you seen my fancy new keychain? I got it at Walmart for $29.99! What a steal! ❞\n");
		super.dialogs.add("\n[Patrolling Guard]:\n\t❝  Argh! I'm tired of walking all day and night! ❞\n");
		patrol = new Patrol();
		ctxt = new Context(this, patrol);
		this.desc = "\n The guard standing in the corner looks very tense and is unlike the other guards.\n"
				+ " He seems to always be on the move... \n";
	}

	public Boolean defaultActivities() throws Exception {
		if(time % 2 == 0) {
			if(!moved) {
				this.ctxt.nextState();
				//System.out.println(this.loc.name);
				moved = true;
			}
		}
		else
			moved = false;

		if((this.time >= 19 || this.time <= 6) && this.loc != null && !this.loc.prisoners.isEmpty()) 
		{
			return nB.doTasks("Patrolling Guard");
		}
		else
			System.out.print("");
		
		return true;
	}

}
