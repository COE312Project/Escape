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
   	 	
   	 	System.out.println(" You pry open the manhole cover and quickly climb down. In pitch black darkness\n"
   	 					 + " you feel around with your hands and keep walking forward. After what feels like\n"
   	 					 + " an eternity, you finally see a light at the end. You stagger towards it and come\n"
   	 					 + " out into an open field. You collapse, out of exhaustion but full of relief. Looking\n"
   	 					 + " up at the night sky, you finally take a breath as a free man again...\n");
   	 	
   	 	try {
			Main.End.end("win");
		} catch (InterruptedException e) {}
	}
}
