package GameCharacters;

public class Character extends GameClock.ConcreteObserver
{
    String name;
    Character(String n, GameClock.Subject s)
    {
    	super(s);
        this.name = n;
    }
}