package Minigame;

public class Watch implements java.lang.Runnable {

	int secs;
	Thread t;

	Watch(int i) { 
		this.secs = i;
		this.t = new Thread(this);
		//t.start(); 
		// timer is started in QuickAttack

	}

	@Override
	public void run() {
		this.runTimer(this.secs);
	}
	
	public void runTimer(int i) {
		System.out.println("\nYou have ");
		while (i > 0)
		{
			System.out.print(i+"...");
			i--;
			try {
			//	Sound.Player.getInstance().play("clock");
			//  Delays the hit sound too much
				Thread.sleep(1000L);
			} catch (Exception e) {
				return;
			}
		}
		System.out.println("You were caught!\n----------GAME OVER----------");
		try {
			Sound.Player.getInstance().play("groan");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
	
}