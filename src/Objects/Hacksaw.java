package Objects;

public class Hacksaw extends Item {

	Minigames.CutWindowBar cwb;
	
	public Hacksaw() {
		super("hacksaw","Cell");
		super.canBeTaken();
		this.desc = "\nIn the corner, there is a hacksaw left by the workers. \n";
		verbs.add("cut");
		verbs.add("saw");
	}
	
	public void use(String verb) {
		cwb = new Minigames.CutWindowBar();
		try {
			this.cwb.cut();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
