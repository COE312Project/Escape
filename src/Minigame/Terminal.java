package Minigame;

import java.util.Scanner;

public class Terminal {
//test
	public static void maintenance() throws InterruptedException {
		System.out.println("Starting maintenance..."); 
		Thread.sleep(1500); 
		System.out.println("Suspending systems...");
		Thread.sleep(1500);
		System.out.println("Surveillance systems offline.");
	}
	public static void main(String[] args) throws InterruptedException
	{
		warden();
	}

	public static void warden()  throws InterruptedException
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
					System.out.println("warden"); break;
				case "ls": 
					System.out.println(files); break;
				case "cat README.txt": 
					System.out.println("For software updates etc. just run the maintenance script to suspend system.\nPS: Don't forget to restore afterwards"); break;
				case "./maintenance.sh": 
					maintenance(); break;
				case "rm restore.sh": 
					System.out.println("File deleted."); files = files.split("    ")[0] + "    "+ files.split("    ")[1]; break;
				case "exit": 
					System.out.println(""); return;
				default:
					System.out.println(cmd+": command not found");
			}

		}
	}
	
}
