package Main;
import Objects.*;

import java.util.ArrayList;

import GameClock.*;
import GameCharacters.*;
import Locations.*;

public class Driver {

	//need to only pass these values here
	public static final String IP = "192.168.0.159";
	public static final int PORT = 23232;
	
	public static void main(String[] args) {
		
		Cell cell = new Cell(null); // send player instance
		
		ConstructionZone constrZone = new ConstructionZone();
		
		Yard yard = new Yard(new ArrayList<Prisoner>(), new ArrayList<Guard>(), constrZone);
		
		CorridorCUp cUp = new CorridorCUp();

		CorridorCDown cDown = new CorridorCDown();
		
		CorridorALeft aLeft = new CorridorALeft();
		
		CorridorARight aRight = new CorridorARight();
		
		CorridorDLeft dLeft = new CorridorDLeft();
		
		CorridorDRight dRight = new CorridorDRight();
		
		CorridorBUp bUp = new CorridorBUp();

		CorridorBDown bDown = new CorridorBDown();
		
		Cafeteria cafeteria = new Cafeteria();

		WardensOffice wardensOffice = new WardensOffice(); // send Warden instance
		Warden w = new Warden(new Clock(), wardensOffice);
		
		wardensOffice.guards.add(w);
		
		cell.setNeighbors(null, aLeft, null, null);
		
		yard.setNeighbors(null, null, cDown, null);
		
		constrZone.setNeighbors(null, yard, yard, null);
		
		cDown.setNeighbors(cUp, dRight, null, yard);
		
		cUp.setNeighbors(aRight, cDown, null, yard);
		
		aRight.setNeighbors(null, cUp, cUp, aLeft);
		
		aLeft.setNeighbors(null, bUp, aRight, bUp);
		
		bUp.setNeighbors(aLeft, bDown, cafeteria, null);
		
		bDown.setNeighbors(bUp, dLeft, wardensOffice, null);
		
		wardensOffice.setNeighbors(null, null, null, bDown);
		
		cafeteria.setNeighbors(null, null, null, bUp);
		
		dLeft.setNeighbors(bDown, null, dRight, bDown);
		
		dRight.setNeighbors(cDown, null, cDown, dLeft);

		wardensOffice.guards.get(0).inventory.get(0).use("");
		
	}

}
