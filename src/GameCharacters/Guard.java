package GameCharacters;

public class Guard extends Character implements Runnable, NPC{
	
	Locations.Location loc;
	Thread t;
	
	
	public Guard(String n, GameClock.Subject s) {
		super(n,s);
		this.inventory.add(new Objects.YardKey()); // all guards have the key
		t = new Thread(this);
		t.start();
	}
	
	
	public void run() {
		
		while(true) {
			synchronized(this.loc) {
				// all npc prisoners automatically go to cell, so if there is any prisoner in the same loc as guard, its the player
				if(this.time >= 19 && !this.loc.prisoners.isEmpty()) 
				{
					System.out.print("YOU ARE CAUGHT!!! ");
					break;
				}
			}
			
		}
		
	}

}
