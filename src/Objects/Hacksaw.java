package Objects;

public class Hacksaw extends Item {

	Minigame.CutWindowBar cwb;
	
	public Hacksaw() {
		super("hacksaw");
	}
	
	public void use(String verb) {
		cwb = new Minigame.CutWindowBar();
		try {
			this.cwb.cut();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
