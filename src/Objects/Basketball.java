package Objects;

public class Basketball extends Item{

	Minigame.Basketball bb = new Minigame.Basketball();
	public Basketball() {
		super("basketball");
	}
	
	public void use(String verb) {
		this.bb.play();
	}
}
