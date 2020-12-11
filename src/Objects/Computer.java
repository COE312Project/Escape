package Objects;

public class Computer extends Item{

	Minigame.Terminal tm = new Minigame.Terminal();
	public Boolean camDisabled = false;

	public Computer() {
		super("computer");
		verbs.add("login");
		verbs.add("access");
	}

	
	public void use(String verb) {
		try {
			camDisabled = this.tm.login();
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
