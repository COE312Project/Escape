package GameAssets;

import java.util.HashMap;
import java.util.Map;
//import java.util.Scanner;


public class GameMap extends Objects.Item{

	private String map = 
					"▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\r\n" + 
					"▓C                                                                                        C▓\r\n" + 
					"▓                                                                                          ▓\r\n" + 
					"▓   █▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀█   ▓\r\n" + 
					"▓   █          █ YOUR CELL █           █           █           █           █           █   ▓\r\n" + 
					"▓   █          █           █           █           █           █           █           █   ▓\r\n" + 
					"▓   █          █           █           █           █           █           █           █   ▓\r\n" + 
					"▓   █▄▄▄▄▄▄▄▄▄▄█▄▄▄▄▄▄▄▄▄▄▄█▄▄▄▄▄▄▄▄▄▄▄█▄▄▄▄▄▄▄▄▄▄▄█▄▄▄▄▄▄▄▄▄▄▄█▄▄▄▄▄▄▄▄▄▄▄█▄▄▄▄▄▄▄▄▄▄▄█   ▓\r\n" + 
					"▓   █                                                                                  █   ▓\r\n" + 
					"▓   █                                                                                  █   ▓\r\n" + 
					"▓   █                                                                                  █   ▓\r\n" + 
					"▓   █    C█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█C    █   ▓\r\n" + 
					"▓   █     █                                    █                                 █     █   ▓\r\n" + 
					"▓   █     █             CAFETERIA              █               YARD              █     █   ▓\r\n" + 
					"▓   █     █                                    █                                 █     █   ▓\r\n" + 
					"▓   █                                          █                                 █     █   ▓\r\n" + 
					"▓   █                                          █                                       █   ▓\r\n" + 
					"▓   █                                          █                                       █   ▓\r\n" + 
					"▓   █     █                                    █                                       █   ▓\r\n" + 
					"▓   █     █                                    █                                       █   ▓\r\n" + 
					"▓   █     █▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█                                       █   ▓\r\n" + 
					"▓   █     █                                    █                                       █   ▓\r\n" + 
					"▓   █     █          WARDEN'S OFFICE           █                                 █     █   ▓\r\n" + 
					"▓   █     █                                    █                                 █     █   ▓\r\n" + 
					"▓   █                                          █                                 █     █   ▓\r\n" + 
					"▓   █                                          █                                 █     █   ▓\r\n" + 
					"▓   █                                          █                                 █     █   ▓\r\n" + 
					"▓   █     █                                    █                                 █     █   ▓\r\n" + 
					"▓   █     █                                    █                                 █     █   ▓\r\n" + 
					"▓   █    C█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█C    █   ▓\r\n" + 
					"▓   █                                                                                  █   ▓\r\n" + 
					"▓   █                                                                                  █   ▓\r\n" + 
					"▓   █                                                                                  █   ▓\r\n" + 
					"▓   █▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█≡≡≡|≡≡≡█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█   ▓\r\n" + 
					"▓                                                                                          ▓\r\n" + 
					"▓C                                                                                        C▓\r\n" + 
					"▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓";

	int curLoc; 

	Map <String, Integer> locCoord = new HashMap<String,Integer>();

	public GameMap() {
		
		super("map");
		super.canBeTaken();
		verbs.add("map");
		verbs.add("check");
		verbs.add("show");
		
		locCoord.put("OuterNorth",140);
		locCoord.put("Cell",491);
		locCoord.put("CorridorNorth-West",871);
		locCoord.put("CorridorNorth-East",916);
		locCoord.put("CorridorWest-North",1511);
		locCoord.put("CorridorWest-South",2357);
		locCoord.put("Cafeteria",1532);
		locCoord.put("WardensOffice",2378);
		locCoord.put("Yard",1945);
		locCoord.put("CorridorEast-North",1588);
		locCoord.put("CorridorEast-South",2434);
		locCoord.put("OuterWest",1882);
		locCoord.put("OuterEast",1969);
		locCoord.put("CorridorSouth-West",2939);
		locCoord.put("CorridorSouth-East",2984);
		locCoord.put("OuterSouth",3336);	

		this.curLoc = locCoord.get("Cell"); // start in cell
	}


	public void printMap() {
		String newMap = this.map.substring(0,curLoc) + "☺" + this.map.substring(curLoc + 1);
		System.out.println("\n" + newMap); // keep the original map intact, otherwise we've to remove the previous X


	}

	public void setLocation(String loc) { // must be called after every move, by the Move Command class
		if (this.locCoord.containsKey(loc)){
			this.curLoc = this.locCoord.get(loc);
		}
		else
		{
			//System.out.println("Err: Send proper location name!!!");// should never happen
			//System.exit(0);
		}

	}


	
	public void use(String verb) {
		this.printMap();
	}

	// Uncomment the following code to test it (import scanner)
	/*
	public static void main(String[] args)  {

		Scanner cin = new Scanner(System.in);
		GameMap m = new GameMap();
		while(true) {
			m.setLocation(cin.nextLine());
			m.printMap();
		}
	}
	*/
}

