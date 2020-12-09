package Objects;

public class Hacksaw extends Item {

	Minigame.CutWindowBar cwb = new Minigame.CutWindowBar();
	
	public Hacksaw() {
		super("hacksaw");
	}
	
	public void use() {
		try {
			this.cwb.cut();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
