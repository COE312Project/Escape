
public class Guard implements Runnable {
	
	Location loc;
	Location PlayerLoc;
	Thread T;
	String name;
	
	
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
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
