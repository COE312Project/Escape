package Game;

import java.util.Scanner;

public class Start {

	static String[] title = new String[] {
			"\t█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█\n",
			"\t█                                                                                                  █\n",
			"\t█\t\t\t   ███████╗███████╗ ██████╗ █████╗ ██████╗ ███████╗\t\t\t   █\n" ,
			"\t█\t\t\t   ██╔════╝██╔════╝██╔════╝██╔══██╗██╔══██╗██╔════╝\t\t\t   █\n" , 
			"\t█\t\t\t   █████╗  ███████╗██║     ███████║██████╔╝█████╗  \t\t\t   █\n" , 
			"\t█\t\t\t   ██╔══╝  ╚════██║██║     ██╔══██║██╔═══╝ ██╔══╝  \t\t\t   █\n" , 
			"\t█\t\t\t   ███████╗███████║╚██████╗██║  ██║██║     ███████╗\t\t\t   █\n" , 
			"\t█\t\t\t   ╚══════╝╚══════╝ ╚═════╝╚═╝  ╚═╝╚═╝     ╚══════╝\t\t\t   █\n",
			"\t█                                                                                                  █\n",
			"\t▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀\n\n"
			};

	static String subtitle = new String( 

	"\t    █▀▄ █▀█   █▄█ █▀█ █ █   █ █ ▄▀█ █ █ █▀▀   █ █ █ █ █ ▄▀█ ▀█▀   █ ▀█▀   ▀█▀ ▄▀█ █▄▀ █▀▀ █▀ ▀█\n"+
	"\t    █▄▀ █▄█    █  █▄█ █▄█   █▀█ █▀█ ▀▄▀ ██▄   ▀▄▀▄▀ █▀█ █▀█  █    █  █     █  █▀█ █ █ ██▄ ▄█  ▄\n"
	);

	public static void start() throws InterruptedException {
		try {
			Sound.Player.getInstance().play("startMusic");
		} catch (Exception e) {
			e.printStackTrace();
		}

		for(String t:title) {
			System.out.print(t);
			Thread.sleep(150);
		}
		Thread.sleep(6000); // to appreciate the music xD
		System.out.println(subtitle);
		Thread.sleep(6000);
		System.out.println("\n\t\t\t\t\t\tPRESS ENTER TO START");
		(new Scanner(System.in)).nextLine();

	}

}
