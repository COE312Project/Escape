package Main;
import Objects.*;
import Commands.*;
import GameAssets.GameMap;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import GameClock.*;
import GameCharacters.*;
import Locations.*;

public class Driver {

	//need to only pass these values here
	public static final String IP = "192.168.1.112";
	public static final int PORT = 23232;

	public static void main(String[] args) throws InterruptedException {

		Cell cell = new Cell(); // send player instance

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


		cell.setNeighbors(null, aLeft, null, null);

		yard.setNeighbors(constrZone, null, cUp, null);

		constrZone.setNeighbors(null, yard, yard, null);

		cDown.setNeighbors(cUp, dRight, null, dRight);

		cUp.setNeighbors(aRight, cDown, null, yard);

		aRight.setNeighbors(null, cUp, cUp, aLeft);

		aLeft.setNeighbors(cell, bUp, aRight, bUp);

		bUp.setNeighbors(aLeft, bDown, cafeteria, null);

		bDown.setNeighbors(bUp, dLeft, wardensOffice, null);

		wardensOffice.setNeighbors(null, null, null, bDown);

		cafeteria.setNeighbors(null, null, null, bUp);

		dLeft.setNeighbors(bDown, null, dRight, bDown);

		dRight.setNeighbors(cDown, null, cDown, dLeft);
		
		GameClock.Clock clock = new Clock();
		
		
		
		CurrentLocation curr = new CurrentLocation(); // now curr has an identity
		curr.loc = cell;
		
		Player player = new Player("Prisoner420",clock,cell);
		cell.prisoners.add(player);
		
		Warden w = new Warden(clock, wardensOffice, cafeteria, player);
		wardensOffice.guards.add(w);
		
		PatrollingGuard pguard = new PatrollingGuard("Jeff", clock, aLeft);
		
		Guard bUpGuard = new Guard("Chris",clock, bUp);
		
		Move move = new Move(curr, player);
		Take take = new Take(player);
		Use use = new Use(player);
		Inventory inventory = new Inventory(player);
		Look look = new Look(player);
		Command[] cmds = new Command[] {move, take, use, inventory, look};
		ControlPanel cp = new ControlPanel(cmds);
		
		// Uncomment if you have 20 seconds to spare
		//Start.start();

		Scanner cin = new Scanner(System.in);
		GameAssets.GameMap map = new GameAssets.GameMap();
		player.inventory.add(map);
		player.map = map;
	
		while(true)
		{
			System.out.print("> ");
			cp.parse(cin.nextLine());
		}
		
		// This proves that the hw issue is solved:
/*		Move move = new Move(curr);
		move.execute("go south");
		System.out.println(curr.loc); */
		
		
		//System.exit(0);

		

	}

}
