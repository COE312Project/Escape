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

		OuterNorth outerN = new OuterNorth();
		
		Sewer sewer = new Sewer();
		
		outerN.setNeighbors(null,null,sewer,null);
		
		ConstructionZone constrZone = new ConstructionZone(outerN);

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

		WardensOffice wardensOffice = new WardensOffice(aLeft); // send Warden instance
		


		cell.setNeighbors(outerN, aLeft, null, null);

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
		
		Guard yardGuard = new Guard("guard",clock,yard,yard);
		yard.guards.add(yardGuard); 
		
		Warden w = new Warden(clock, wardensOffice, cafeteria, player, yard);
		wardensOffice.guards.add(w);
		
		PatrollingGuard pguard = new PatrollingGuard("guard", clock, aLeft, yard);
				
		Guard bUpGuard = new Guard("guard",clock, bUp, yard);
		bUp.guards.add(bUpGuard); 
		
		Guard dLeftGuard = new Guard("guard",clock, dLeft, yard);
		dLeft.guards.add(dLeftGuard); 
		
		Guard dRightGuard = new Guard("guard",clock, dRight, yard);
		dRight.guards.add(dRightGuard); 
		
		GameAssets.GameMap map = new GameAssets.GameMap();
		
		Move move = new Move(curr, player, map);
		Take take = new Take(player);
		Use use = new Use(player);
		Inventory inventory = new Inventory(player);
		Look look = new Look(player);
		Time time = new Time(player);
		Talk talk = new Talk(player);
		
		Command[] cmds = new Command[] {move, take, use, inventory, look, time, talk};
		ControlPanel cp = new ControlPanel(cmds);
		
		// Uncomment if you have 20 seconds to spare
		sewer.enter();
		Start.start();

		Scanner cin = new Scanner(System.in);
		//player.inventory.add(map);
		//player.map = map;
		
		FriendlyPrisoner fp = new FriendlyPrisoner("Joe",clock,yard,map,yard, player, wardensOffice);
		yard.prisoners.add(fp);
		
		Bed bed = new Bed();
		cell.items.add(bed);
		
		
		// for Start
		// if we make it "press enter to continue" this is fine
		//maybe we should make the Start not say "enter any key" :( I wasted 1 hr 
		//End.end("win");

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
