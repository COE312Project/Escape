package Objects;

public class Food extends Item{

	public Food() {
		super("food");
	}

	
	public void use(String verb) {
		try {
		if(verb.equalsIgnoreCase("eat")) {	// replace with search in array of eat synonyms
			System.out.println("You ate the food!");
		}
		else if (verb.equalsIgnoreCase("throw")) {	// replace with search in array of throw synonyms
			System.out.println("You threw the food across the room!");
			Sound.Player.getInstance().play("breakingglass");
		}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
