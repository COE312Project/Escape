package GameClock;


public class Clock extends ConcreteSubject implements Runnable{

	Thread t;
	int time = 0;
	
	public Clock() {
		this.t = new Thread(this);
		t.start();
	}
	

	public void run() {

		while(true) 
		{
			super.notifyObservers(time);

			try {
				Thread.sleep(1000); // 60,000 ms = 1 min = 1hr in game. Change to 1000 for debugging.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			time = (time+1) % 24;
		}
	}
	
	// Uncomment this main to test and reduce the time in line 22
/* 
public static void main(String[] args) {

		
		class Guard extends ConcreteObserver implements Runnable{

			Thread t;
			public Guard(Subject s) {
				super(s);
				t=new Thread(this); t.start();
			}
			public void run() {
				while(true) {
					if(super.time >= 7)
					{
						System.out.println("Im guard " + this + " and its past 7 !!!");
					}
					else
						System.out.print("");
				}
			}
		}
		
		class Prisoner extends ConcreteObserver implements Runnable{

			Thread t;
			public Prisoner(Subject s) {
				super(s);
				t=new Thread(this); t.start();
			}
			public void run() {
				while(true) {
					if(super.time >= 5)
					{
						System.out.println("Im prisoner " + this + " and its past 5 !!!");
					}
					else
						System.out.print("");
				}
			}
		}
		
		
		Clock clock = new Clock();
		Guard g1 = new Guard(clock);
		Guard g2 = new Guard(clock);
		Prisoner p1 = new Prisoner(clock);
	}
*/
	
}
