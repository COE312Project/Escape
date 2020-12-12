package Objects;
import Locations.*;

public class Hacksaw extends Item {

	Minigames.CutWindowBar cwb;
	Location outerN;

	public Hacksaw(Location outerN) {
		super("hacksaw","Cell");
		super.canBeTaken();
		this.outerN = outerN;
		this.desc = "\nIn the corner, there is a hacksaw left by the workers. \n";
		verbs.add("cut");
		verbs.add("saw");
	}

	public void use(String verb) {
		if(this.outerN.isLocked) {
			cwb = new Minigames.CutWindowBar();
			try {
				this.cwb.cut();
			} catch (Exception e) {
				e.printStackTrace();
			}
			this.outerN.isLocked = false;
		}
		else
			System.out.println("\n\t<< The bars are already broken! What are you trying to achieve? >>");
	}

}
