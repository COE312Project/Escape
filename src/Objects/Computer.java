package Objects;

public class Computer extends Item{

	Minigame.Terminal tm = new Minigame.Terminal();
	public Computer() {
		super("computer");
	}

	
	public void use(String verb) {
		try {
			this.tm.login();
			
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

}
