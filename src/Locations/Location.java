 package Locations;

import java.util.ArrayList;
import GameCharacters.*;

public class Location {
     public String name;

     public ArrayList<Guard> guards = new ArrayList<GameCharacters.Guard>();
     public ArrayList<Prisoner> prisoners = new ArrayList<GameCharacters.Prisoner>();
     public ArrayList<Objects.Item> items = new ArrayList<Objects.Item>();
     public Location north, south, east, west;
     
     public Location()
     {
    	 this.north = this.south = this.east = this.west = null;
     }
     
     public void setNeighbors(Location n, Location s, Location e, Location w) {
    	 this.north = n;
    	 this.south = s;
    	 this.east = e;
    	 this.west = w;
     }
       
}
