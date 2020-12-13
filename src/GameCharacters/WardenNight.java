package GameCharacters;

public class WardenNight extends NightBehaviour {

	Boolean doTasks(String n) {
		
		System.out.println("\n["+n+"]:\n\t❝   Aha! You thought I wouldn't see you? Nothing gets past me. Guards, detain him! ❞\n");
		try {
			Game.End.end("caught");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	

}
