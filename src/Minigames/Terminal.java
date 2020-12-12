package Minigames;


import java.util.Scanner;

public class Terminal {

	public void maintenance() throws InterruptedException {
		System.out.println("Starting maintenance..."); 
		Thread.sleep(1500); 
		System.out.println("Suspending systems...");
		Thread.sleep(1500);
		System.out.println("Surveillance systems offline.");
	}
	
	Boolean check1 = false, check2 = false;
	
	public Boolean login()  throws Exception
	{
		Scanner cin = new Scanner(System.in);
		String files = "README.txt    maintenance.sh    restore.sh";

		while(true)
		{
			System.out.print("warden@CamSystem:~$ ");
			String cmd = cin.nextLine();
			switch(cmd)
			{
				case "whoami": 
					System.out.println("warden"); Sound.Player.getInstance().play("button"); break;
				case "ls": 
					System.out.println(files); Sound.Player.getInstance().play("button"); break;
				case "cat README.txt": 
					System.out.println("For software updates etc. just run the maintenance script to suspend system.\nPS: Don't forget to restore afterwards"); Sound.Player.getInstance().play("button"); break;
				case "./maintenance.sh": 
					maintenance(); check1 = true; break;
				case "rm restore.sh": 
					check2 = true; System.out.println("File deleted."); files = files.split("    ")[0] + "    "+ files.split("    ")[1]; Sound.Player.getInstance().play("button"); break;
				case "exit": 
					System.out.println(""); Sound.Player.getInstance().play("shutdown"); return check1 && check2;
				default:
					System.out.println(cmd+": command not found"); Sound.Player.getInstance().play("error");
			}

		}
		
	}
	
}
