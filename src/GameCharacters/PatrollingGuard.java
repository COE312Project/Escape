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

	public void defaultActivities() throws Exception {
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
			System.out.print("\n[Patrolling Guard]:\nYou there! What are you doing outside your cell ?!\n");
			System.out.println("\t\t\t<< GAME OVER >>");
			Sound.Player.getInstance().play("game_over");
			Thread.sleep(3000);	//need this coz system.exit happens immediately after this and no sound will be played
			System.exit(0);
		}
		else
			System.out.print("");
	}

}
