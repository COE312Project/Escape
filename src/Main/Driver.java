package Main;
import Objects.*;

import java.util.ArrayList;

import GameCharacters.Guard;
import GameCharacters.Prisoner;
import Locations.*;

public class Driver {

	//need to only change these values here
	public static final String IP = "192.168.0.135";
	public static final int PORT = 23232;
	
	public static void main(String[] args) {
		
		//ArrayList<Prisoner> p, ArrayList<Guard>g, String ip, int port, ConstructionZone cz, Location n, Location s, Location e, Location w
		Yard yard = new Yard(new ArrayList<Prisoner>(), new ArrayList<Guard>(), null, null, null, null, null);
		
		//String ip, int port ,Location n, Location s, Location e, Location w
		ConstructionZone constructionZone = new ConstructionZone(null, yard, null, yard);
		
		
		
	}

}
