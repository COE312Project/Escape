package GameCharacters;

public class Guard extends Character implements Runnable, NPC{
	
	Locations.Location loc;
	Locations.Location PlayerLoc;
	Thread T;
	
	
	public Guard(String n, GameClock.Subject s) {
		super(n,s);
	}
	
	
	@Override
	public void run() {
		
		while(true) {
			synchronized(this.loc) {
				if(this.loc.name==this.PlayerLoc.name)
				{
					System.out.print("YOU ARE CAUGHT!!! ");
					break;
				}
			}
			
		}
		
	}

}