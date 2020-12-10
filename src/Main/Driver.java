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
		
		Yard yard = new Yard();
		
		ConstructionZone constrZone = new ConstructionZone();
		
		CorridorCUp cUp = new CorridorCUp();

		CorridorCDown cDown = new CorridorCDown();
		
		CorridorALeft aLeft = new CorridorALeft();
		
		CorridorARight aRight = new CorridorARight();
		
		CorridorDLeft dLeft = new CorridorDLeft();
		
		CorridorDRight dRight = new CorridorDRight();
		
		CorridorBUp bUp = new CorridorBUp();

		CorridorBDown bDown = new CorridorBDown();
		
		Cafeteria cafeteria = new Cafeteria();
		
		WardensOffice wardensOffice = new WardensOffice();
		
		yard = new Yard(new ArrayList<Prisoner>(), new ArrayList<Guard>(), constrZone, null, null, cDown, null);
		
		constrZone = new ConstructionZone(null, yard, yard, null);
		
		cDown = new CorridorCDown(cUp, dRight, null, yard);
		
		cUp = new CorridorCUp(null, cDown, aRight, yard);
		
		aRight = new CorridorARight(null, null, cUp, aLeft);
		
		aLeft = new CorridorALeft(null, null, aRight, bUp);
		
		bUp = new CorridorBUp(null, bDown, cafeteria, null);
		
		bDown = new CorridorBDown(bUp, dLeft, wardensOffice, null);
		
		wardensOffice = new WardensOffice(null, null, null, bDown);
		
		
		
	}

}
