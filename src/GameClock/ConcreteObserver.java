package GameClock;

public class ConcreteObserver implements Observer{

	public int time;
	Subject subject;
	
	public ConcreteObserver(Subject s) {
		this.subject = s;
		this.subject.registerObserver(this);
	}
	
	public void update(int time)
	{
		this.time = time;
	}
}
