package GameClock;

import java.util.ArrayList;

public abstract class ConcreteSubject implements Subject{

	ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public void registerObserver(Observer o)
	{
		this.observers.add(o);
	}
	
	
	public void notifyObservers(int data)
	{

		for(Observer o:this.observers) {
			o.update(data);
		}
	}
}
