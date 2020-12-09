package Objects;

public class Hacksaw extends Item {

	Minigame.CutWindowBar cwb = new Minigame.CutWindowBar();
	
	public Hacksaw() {
		super("hacksaw");
	}
	
	public void use(String verb) {
		try {
			this.cwb.cut();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
