package GameClock;

public class ConcreteObserver implements Observer{

	public Integer time;
	Subject subject;

	public ConcreteObserver(Subject s) {
		this.subject = s;
		this.subject.registerObserver(this);
	}

	public void update(int time)
	{
		synchronized(this.time) {
			this.time = time;
		}
	}
}
