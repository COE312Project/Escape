package Objects;

public class Food extends Item{

	public Food() {
		super("food","Cafeteria");
		super.canBeTaken();
		super.isExpendable = true;
		this.desc = "\n Today's special is 'grey blob' with 'mystery meat'. Doesn't look very appetizing!"
				+ "\n You wonder what else you could do with it... \n";
		verbs.add("eat");
		verbs.add("throw");
	}

	
	public void use(String verb) {
		try {
		if(verb.equalsIgnoreCase("eat")) {	// replace with search in array of eat synonyms
			System.out.println("\n Being very hungry, you decide to eat after all but that turned out to be a bad decision!"
					+ "\n About to throw up, you wish you had thrown it away instead...\n");
		}
		else if (verb.equalsIgnoreCase("throw")) {	// replace with search in array of throw synonyms
			System.out.println(" You threw the food across the room, landing square in the face of Big Shaq! "+ //wow ok
								"\n He lunges at you, but you duck in time and Mean Joe gets a nice broken nose! "+
								"\n In a few minutes, there's complete chaos in the Cafeteria and the Warden and a couple of guards rush in.");
			Sound.Player.getInstance().play("breakingglass");
			
		}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
