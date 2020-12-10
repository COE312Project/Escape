package Main;
import Objects.*;

import java.util.ArrayList;

import GameCharacters.Guard;
import GameCharacters.Prisoner;
import Locations.*;

public class Driver {

	//need to only pass these values here
	public static final String IP = "192.168.0.135";
	public static final int PORT = 23232;
	
	public static void main(String[] args) {
		
		//ArrayList<Prisoner> p, ArrayList<Guard>g, ConstructionZone cz, Location n, Location s, Location e, Location w
		Yard yard = new Yard();
		
		ConstructionZone constructionZone = new ConstructionZone();
		
		CorridorCUp corridoorCUp = new CorridorCUp();

		CorridorCDown corridoorCDown = new CorridorCDown();
		
		CorridorALeft corridoorALeft = new CorridorALeft();
		
		CorridorARight corridoorARight = new CorridorARight();
		
		CorridorDLeft corridoorDLeft = new CorridorDLeft();
		
		CorridorDRight corridoorDRight = new CorridorDRight();
		
		CorridorBUp corridorBUp = new CorridorBUp();

		CorridorBDown corridoorBDown = new CorridorBDown();
		
		
	}

}
