package Objects;

public class YardKey extends Item {

	Minigames.Pocket p;
	Locations.Yard yard;

	public YardKey(Locations.Yard yard) {
		super("key", "CorridorEast-North");
		verbs.add("steal");
		verbs.add("take");
		super.mustBeTaken = true;
		super.isException = true;
		this.desc = "\nSomething shiny catches your eye and it turns out to be a key hanging from the guards belt!"
				+ "\nIt has a large 'Y' printed on it and you wonder what that could be... \n";

		this.yard = yard;
	}

	public void use(String verb) {

		if(!acquired) {
			p = new Minigames.Pocket();
			this.p.pick();
			super.acquired = true;
		}
		else {
			if(this.yard.isLocked) {
				this.yard.isLocked = false;
				System.out.println("\n << You unlocked the yard entrance. >>\n");
			}
			else
				System.out.println("\n...why?\n");
		}
	}

}
