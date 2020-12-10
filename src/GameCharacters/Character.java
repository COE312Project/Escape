package GameCharacters;

import java.util.ArrayList;

public class Character extends GameClock.ConcreteObserver
{
	public Locations.Location loc;
    String name;
	public ArrayList<Objects.Item> inventory = new ArrayList<Objects.Item>();

    Character(String n, GameClock.Subject s, Locations.Location l)
    {
    	super(s);
        this.name = n;
        this.loc = l;
    }
}