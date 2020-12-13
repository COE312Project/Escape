package Locations;

public class Sewer extends Location{

	public Sewer()
	{
		super();
		this.name = "Down the Sewer";
	}

	public void enter()
	{
		System.out.println("\t\t" + this.name);
		System.out.println("\t\t"+"‾".repeat(this.name.length()));
		try {

			Thread.sleep(1000);
			System.out.println(" You pry open the manhole cover and quickly climb down. In pitch black darkness\n");
			Thread.sleep(3000);
			System.out.println(" you feel around with your hands and keep walking forward. After what feels like\n");
			Thread.sleep(3000);
			System.out.println(" an eternity, you finally see a light at the end. You stagger towards it and come\n");
			Thread.sleep(3000);
			System.out.println(" out into an open field. You collapse, out of exhaustion but full of relief. Looking\n");
			Thread.sleep(3000);
			System.out.println(" up at the night sky, you finally take a breath as a free man again...\n\n\n");
			Thread.sleep(5000);


			Main.End.end("win");
		} catch (InterruptedException e) {}
	}
}
