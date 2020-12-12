package Objects;
import Locations.*;

public class Paperclip extends Item{

	Minigames.LockPick lp;
	Location corrALeft;

	public Paperclip(Location aLeft) {
		super("paperclip", "Cell");
		super.canBeTaken();
		this.corrALeft = aLeft;
		verbs.add("pick");
		this.desc = "\nThere is a paperclip lying on the desk. \n";
	}

	public void use(String verb) {

		if(this.corrALeft.isLocked) {
			lp = new Minigames.LockPick();
			
			try {
				this.lp.pick();

			} catch (Exception e) {
				e.printStackTrace();
			}
			corrALeft.isLocked = false;
		}
		else
			System.out.println("\n...why?\n");
	}

}
