package GameCharacters;

import GameClock.Subject;
import Locations.Location;

public class PatrollingGuard extends Guard{

	Context ctxt;
	Patrol patrol;
	Boolean moved = false;

	public PatrollingGuard(String n, Subject s, Location l) {
		super(n, s, l);
		patrol = new Patrol();
		ctxt = new Context(this, patrol);
	}

	public void defaultActivities() {
		if(time % 2 == 0) {
			if(!moved) {
				this.ctxt.nextState();
				moved = true;
			}
		}
		else
			moved = false;

		if((this.time >= 19 || this.time <= 6) && this.loc != null && !this.loc.prisoners.isEmpty()) 
		{
			System.out.print("\nYou there! What are you doing outside your cell ?!\n" + time);
			System.exit(0);
		}
		else
			System.out.print("");
	}

}
