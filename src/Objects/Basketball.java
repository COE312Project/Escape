package Objects;

public class Basketball extends Item{

	Minigame.Basketball bb;
	public Basketball() {
		super("basketball");
	}
	
	public void use(String verb) {
		bb = new Minigame.Basketball();
		this.bb.play();
	}
}
