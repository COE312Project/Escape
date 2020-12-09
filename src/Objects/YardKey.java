package Objects;

public class YardKey extends Item {

	Minigame.Pocket p = new Minigame.Pocket();
	
	public YardKey() {
		super("key");
	}

	public void use(String verb) {
		try {
			this.p.pick();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
