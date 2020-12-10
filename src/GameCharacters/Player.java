package GameCharacters;

public class Player extends Prisoner implements Runnable
{
	Thread t;
    Player(String n, GameClock.Subject s, Locations.Location l)
    {
        super(n, s, l);
        t = new Thread(this);
        t.start();
    }
    
    public void run() {
    	while(true) {
    		if(this.time == 18)
    			System.out.println("It's 6:00 pm! You have 1 minute to return to your cell.");
    		else
    			System.out.print("");
    	}
    }
}
