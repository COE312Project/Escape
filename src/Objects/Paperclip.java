package Objects;

public class Paperclip extends Item{

	Minigame.LockPick lp = new Minigame.LockPick();
	
	public Paperclip() {
		super("paperclip");
	}

	public void use() {
		try {
			this.lp.pick();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
