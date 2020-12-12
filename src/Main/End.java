package Main;

public class End {
	
	static String pretitle_caught = new String( 

			"\t    █▄█ █▀█ █ █   █ █ █ █▀▀ █▀█ █▀▀   █▀▀ ▄▀█ █ █ █▀▀ █ █ ▀█▀ ▀█\n" + 
			"\t     █  █▄█ █▄█   ▀▄▀▄▀ ██▄ █▀▄ ██▄   █▄▄ █▀█ █▄█ █▄█ █▀█  █   ▄\n"
	);

	static String pretitle_dead = new String( 

			"\t    █▄█ █▀█ █░█   █▀▄ █ █▀▀ █▀▄ ▀█ \n" + 
			"\t    ░█░ █▄█ █▄█   █▄▀ █ ██▄ █▄▀  ▄\n"
	);
	
	static String[] title = new String[] {
			"\t█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█\n",
			"\t█                                                                                                  █\n",
			"\t█\t\t ██████╗  █████╗ ███╗   ███╗███████╗   █████╗ ██╗   ██╗███████╗██████╗ \t\t   █\n" + 
			"\t█\t\t██╔════╝ ██╔══██╗████╗ ████║██╔════╝  ██╔══██╗██║   ██║██╔════╝██╔══██╗\t\t   █\n" + 
			"\t█\t\t██║  ██╗ ███████║██╔████╔██║█████╗    ██║  ██║╚██╗ ██╔╝█████╗  ██████╔╝\t\t   █\n" + 
			"\t█\t\t██║  ╚██╗██╔══██║██║╚██╔╝██║██╔══╝    ██║  ██║ ╚████╔╝ ██╔══╝  ██╔══██╗\t\t   █\n" + 
			"\t█\t\t╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗  ╚█████╔╝  ╚██╔╝  ███████╗██║  ██║\t\t   █\n" + 
			"\t█\t\t ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝   ╚════╝    ╚═╝   ╚══════╝╚═╝  ╚═╝\t\t   █\n" +
			"\t█                                                                                                  █\n",
			"\t▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀\n\n"
	};

	public static void end(String ending) throws InterruptedException {
		
		if(ending.equals("caught"))
		{
			try {
				Sound.Player.getInstance().play("game_over");
			} catch (Exception e) {
				e.printStackTrace();
			}
	
			System.out.println(pretitle_caught);
		}
		else if(ending.equals("dead"))
		{
			try {
				Sound.Player.getInstance().play("groan");
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(pretitle_dead);
		}
				
		for(String t:title) {
			System.out.print(t);
		}
		
		Thread.sleep(5000);	//need this coz system.exit happens immediately after this and no sound will be played
		
		System.exit(0);
		
	}

}