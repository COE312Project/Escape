package GameCharacters;

public class Context {

	private State state = null;
	Guard g;

	public Context (Guard g, State state) {
		this.g = g;
		this.state = state; 
	}

	public void nextState() {
		state.next(this);
	}
}

