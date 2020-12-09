package GameCharacters;

public class Guard implements Runnable, NPC{
	
	Locations.Location loc;
	Locations.Location PlayerLoc;
	Thread T;
	String name;
	
	
	
	
	
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
