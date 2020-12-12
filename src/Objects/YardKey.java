package Objects;

public class YardKey extends Item {

	Minigames.Pocket p;
	Locations.Yard yard;

	public YardKey(Locations.Yard yard) {
		super("key");
		verbs.add("steal");
		verbs.add("take");
		super.mustBeTaken = true;
		super.isException = true;
		
		this.yard = yard;
	}

	public void use(String verb) {

		if(!acquired) {
			p = new Minigames.Pocket();

			try {
				this.p.pick();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			super.acquired = true;
		}
		else {
			this.yard.isLocked = false;
			System.out.println("\n << You unlocked the yard entrance. >>\n");
		}
	}

}
