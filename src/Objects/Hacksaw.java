package Objects;

public class Hacksaw extends Item {

	Minigame.CutWindowBar cwb;
	
	public Hacksaw() {
		super("hacksaw");
		cwb = new Minigame.CutWindowBar();
	}
	
	public void use(String verb) {
		try {
			this.cwb.cut();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
