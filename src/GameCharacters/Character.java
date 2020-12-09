package GameCharacters;

import java.util.ArrayList;

public class Character extends GameClock.ConcreteObserver
{
    String name;
	ArrayList<Objects.Item> inventory = new ArrayList<Objects.Item>();

    Character(String n, GameClock.Subject s)
    {
    	super(s);
        this.name = n;
    }
}