package Objects;

public class Paperclip extends Item{

	Minigame.LockPick lp;
	
	public Paperclip(String ip, int port) {
		super("paperclip");
		lp = new Minigame.LockPick(ip, port);
	}

	public void use(String verb) {
		try {
			this.lp.pick();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
