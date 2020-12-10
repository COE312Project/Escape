package Objects;

public class Paperclip extends Item{

	Minigame.LockPick lp;
	
	public Paperclip() {
		super("paperclip");
		lp = new Minigame.LockPick();
	}

	public void use(String verb) {
		try {
			this.lp.pick();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
