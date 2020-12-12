package Objects;

public class Computer extends Item{

	Minigames.Terminal tm = new Minigames.Terminal();
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
