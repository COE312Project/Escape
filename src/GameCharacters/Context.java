package GameCharacters;

import Locations.Location;

public class Context {

	private State state = null;
	Location l = null;
	public void previousState() {
	state.prev(this,l);
	}
	public void nextState() {
	state.next(this,l);
	}
	public void printStatus() {
	state.printStatus();
	}
	public void setState(State state) {
	this.state = state;}
}
