 package Locations;

import java.util.ArrayList;
import GameCharacters.*;

public class Location {
     public String name;

     public ArrayList<Guard> guards = null;
     public ArrayList<Prisoner> prisoners = null;
     public ArrayList<Objects.Item> items = null;
     public Location north, south, east, west;
     
     public Location(Location n, Location s, Location e, Location w) {
    	 this.north = n;
    	 this.south = s;
    	 this.east = e;
    	 this.west = w;
     }
       
}
