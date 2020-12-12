package Objects;

import java.util.Scanner;

public class Bed extends Item{

	public Bed() {
		super("bed", "Cell");
		verbs.add("sleep");
		this.desc = "\n On your left is a dusty bed that looks like it's older than you. \n";
	}

	public void use(String verb) {
		System.out.println(" You lie down and fall fast asleeep. \n");
		System.out.println(" \t<< PRESS ENTER KEY TO CONTINUE >>\n");
		(new Scanner(System.in)).nextLine();
		System.out.println(" You feel refreshed. \n");
	}

}
