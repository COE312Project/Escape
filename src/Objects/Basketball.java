package Objects;

public class Basketball extends Item{

	Minigames.Basketball bb;
	public Basketball() {
		super("basketball");
		verbs.add("play");
	}
	
	public void use(String verb) {
		bb = new Minigames.Basketball();
		this.bb.play();
	}
}
