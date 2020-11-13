package Minigame;

public class Watch implements java.lang.Runnable {

	int i;
	Thread t;

	Watch() { 
		i = 3;
		t = new Thread(this);
	}

	@Override
	public void run() {
		try {
			this.runTimer();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void runTimer() throws InterruptedException {
		System.out.println("You have ");
		while (i > 0)
		{
			System.out.print(i+"...");
			i--;
			Thread.sleep(1000L);
		}
		System.out.println("You were caught!\n----------GAME OVER----------");
		System.exit(0);
	}
	
}