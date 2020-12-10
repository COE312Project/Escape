package Main;

public class Start {

	static String[] title = new String[] {
			"\t█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█\n",
			"\t█                                                                                                  █\n",
			"\t█\t\t\t   ███████╗███████╗ ██████╗ █████╗ ██████╗ ███████╗\t\t\t   █\r\n" ,
			"\t█\t\t\t   ██╔════╝██╔════╝██╔════╝██╔══██╗██╔══██╗██╔════╝\t\t\t   █\r\n" , 
			"\t█\t\t\t   █████╗  ███████╗██║     ███████║██████╔╝█████╗  \t\t\t   █\r\n" , 
			"\t█\t\t\t   ██╔══╝  ╚════██║██║     ██╔══██║██╔═══╝ ██╔══╝  \t\t\t   █\r\n" , 
			"\t█\t\t\t   ███████╗███████║╚██████╗██║  ██║██║     ███████╗\t\t\t   █\r\n" , 
			"\t█\t\t\t   ╚══════╝╚══════╝ ╚═════╝╚═╝  ╚═╝╚═╝     ╚══════╝\t\t\t   █\r\n",
			"\t█                                                                                                  █\n",
			"\t▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀\n\n"
			};

	static String subtitle = new String( 

	"\t    █▀▄ █▀█   █▄█ █▀█ █░█   █░█ ▄▀█ █░█ █▀▀   █░█░█ █░█ ▄▀█ ▀█▀   █ ▀█▀   ▀█▀ ▄▀█ █▄▀ █▀▀ █▀ ▀█\r\n"+
	"\t    █▄▀ █▄█   ░█░ █▄█ █▄█   █▀█ █▀█ ▀▄▀ ██▄   ▀▄▀▄▀ █▀█ █▀█ ░█░   █ ░█░   ░█░ █▀█ █░█ ██▄ ▄█ ░▄\n"
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
		Thread.sleep(5000); // to appreciate the music xD
		System.out.println(subtitle);
		Thread.sleep(5000);
		System.out.println("\n\t\t\t\t\t\tPRESS ANY KEY TO START");

	}

}
