package Objects;

public class Basketball extends Item{

	Minigame.Basketball bb;
	public Basketball(String ip, int port) {
		super("basketball");
		bb = new Minigame.Basketball(ip, port);
	}
	
	public void use(String verb) {
		this.bb.play();
	}
}
