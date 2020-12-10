package Objects;

public class Paperclip extends Item{

	Minigame.LockPick lp;
	
	public Paperclip() {
		super("paperclip");
	}

	public void use(String verb) {
		lp = new Minigame.LockPick();

		try {
			this.lp.pick();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
