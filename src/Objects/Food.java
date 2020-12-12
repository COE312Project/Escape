package Objects;

public class Food extends Item{

	public Food() {
		super("food");
		super.canBeTaken();
		super.isExpendable = true;
		verbs.add("eat");
		verbs.add("throw");
	}

	
	public void use(String verb) {
		try {
		if(verb.equalsIgnoreCase("eat")) {	// replace with search in array of eat synonyms
			System.out.println("You ate the food!");
		}
		else if (verb.equalsIgnoreCase("throw")) {	// replace with search in array of throw synonyms
			System.out.println("You threw the food across the room, landing square in the face of Big Shaq! "+ //wow ok
								"\nHe lunges at you, but you duck in time and Mean Joe get's a nice broken nose! "+
								"\nIn a few minutes, there's complete chaos in the Cafeteria and the Warden and a couple of guards rush in.");
			Sound.Player.getInstance().play("breakingglass");
			
		}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
