package Objects;

public class Paperclip extends Item{

	Minigames.LockPick lp;
	
	public Paperclip() {
		super("paperclip", "Cell");
		super.canBeTaken();
		verbs.add("pick");
		this.desc = "\nThere is a paperclip lying on the desk. \n";
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
