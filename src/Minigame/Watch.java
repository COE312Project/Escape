package Minigame;

public class Watch implements java.lang.Runnable {

	int secs;
	Thread t;

	Watch(int i) { 
		this.secs = i;
		this.t = new Thread(this);
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
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				return;
			}
		}
		System.out.println("You were caught!\n----------GAME OVER----------");
		System.exit(0);
	}
	
}