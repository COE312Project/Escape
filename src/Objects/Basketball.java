package Objects;

public class Basketball extends Item{

	Minigame.Basketball bb;
	public Basketball() {
		super("basketball");
		bb = new Minigame.Basketball();
	}
	
	public void use(String verb) {
		this.bb.play();
	}
}
