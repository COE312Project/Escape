package GameClock;

public class ConcreteObserver implements Observer{

	public Integer time = 0;
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
