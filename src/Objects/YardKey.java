package Objects;

public class YardKey extends Item {

	Minigame.Pocket p;
	
	public YardKey() {
		super("key");
	}

	public void use(String verb) {
		p = new Minigame.Pocket();

		try {
			this.p.pick();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
