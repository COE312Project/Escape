package Objects;

public class Basketball extends Item{

	Minigames.Basketball bb;
	public Boolean won = false;
	public Basketball() {
		super("basketball","Yard");
		verbs.add("play");
	}
	
	public void use(String verb) {
		bb = new Minigames.Basketball();
		this.won = this.bb.play();
	}
}
