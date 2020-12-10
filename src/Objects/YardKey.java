package Objects;

public class YardKey extends Item {

	Minigame.Pocket p;
	
	public YardKey() {
		super("key");
		p = new Minigame.Pocket();
	}

	public void use(String verb) {
		try {
			this.p.pick();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
