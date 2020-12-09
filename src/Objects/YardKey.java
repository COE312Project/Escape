package Objects;

public class YardKey extends Item {

	Minigame.Pocket p;
	
	public YardKey(String ip, int port) {
		super("key");
		p = new Minigame.Pocket(ip, port);
	}

	public void use(String verb) {
		try {
			this.p.pick();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
