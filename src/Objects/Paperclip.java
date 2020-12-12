package Objects;

public class Paperclip extends Item{

	Minigames.LockPick lp;
	
	public Paperclip() {
		super("paperclip");
		super.canBeTaken();
		verbs.add("pick");
	}

	public void use(String verb) {
		lp = new Minigames.LockPick();

		try {
			this.lp.pick();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
