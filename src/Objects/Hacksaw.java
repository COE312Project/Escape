package Objects;

public class Hacksaw extends Item {

	Minigame.CutWindowBar cwb;
	
	public Hacksaw() {
		super("hacksaw");
		super.canBeTaken();
		verbs.add("cut");
		verbs.add("saw");
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
