package GameCharacters;

import Locations.Location;

public class Context {

	private State state = null;
	Location A = null, B=null,C=null;
	Guard g = null;
	
	public Context(Location A,Location B,Location C) {
		
		this.state=new AllStates(); 
		
		this.A=A;
		this.B=B;
		this.C=C;
		
	}
	
	public void previousState() {
	state.State1(this,A,B,C);
	}
	public void nextState() {
	state.State2(this,A,B,C);
	}
	public void printStatus() {
	state.printStatus();
	}
	public void setState(State state) {
	this.state = state;}
}
