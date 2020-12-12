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
		System.out.println("\nThe guard hits you hard on the face.\nYou go down with your nose bleeding and you start seeing blurry double visions.\n"
				+ "You think of the last good time you had...\nSneaking out of the Bank of America with your heist crew with your share of the 10 million dollars\n"
				+ "Your vision eventually fades into darkness.");
		try {
			Main.End.end("dead");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}