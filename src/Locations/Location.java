 package Locations;

import java.util.ArrayList;
import GameCharacters.*;

public class Location {
     public String name;
     public String desc, nDesc,sDesc, eDesc, wDesc;
     public String nightDesc = "";

     public ArrayList<Guard> guards = new ArrayList<GameCharacters.Guard>();
     public ArrayList<Prisoner> prisoners = new ArrayList<GameCharacters.Prisoner>();
     public ArrayList<Objects.Item> items = new ArrayList<Objects.Item>();
     public Location north, south, east, west;
     public Boolean isLocked = false;
     public Boolean commotion = false;
     
     public Location()
     {
    	 this.north = this.south = this.east = this.west = null;
    	 desc = nDesc = sDesc = eDesc = wDesc = "";
     }
     
     public void setNeighbors(Location n, Location s, Location e, Location w) {
    	 this.north = n;
    	 this.south = s;
    	 this.east = e;
    	 this.west = w;
     }
     
     public void enter() {
    	 System.out.println("\t\t" + this.name + "\n\t\t"+"‾".repeat(this.name.length()));
     }
       
}
