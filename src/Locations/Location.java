 package Locations;

 import java.util.Scanner;
 import java.util.ArrayList;

 import GameAssets.GameMap;

 public class Location {
     public String name;

     public ArrayList<Outside.Guard> guards;
     public ArrayList<Outside.NPC> NPCs;
     public ArrayList<Outside.Item> items;

    //Uncomment the following code and the imports to test it
	
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        GameMap m = new GameMap();
        while (true)
        {
            Location l = new Location();
            System.out.println("Location name: ");
            l.name = cin.nextLine();
            m.setLocation(l.name);
            m.printMap();
        }
    }
    
}
