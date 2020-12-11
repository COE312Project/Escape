package Objects;

public class YardKey extends Item {

	Minigame.Pocket p;

	public YardKey() {
		super("key");
		verbs.add("steal");
		verbs.add("take");
		super.mustBeTaken = true;
		super.isException = true;
	}

	public void use(String verb) {

		if(!acquired) {
			p = new Minigame.Pocket();

			try {
				this.p.pick();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			super.acquired = true;
		}
		else {
			System.out.println("You unlocked the yard entrance.");
		}
	}

}
