package GameClock;

public interface Subject {

	public void registerObserver(Observer o);
	public void notifyObservers(int data);

}
