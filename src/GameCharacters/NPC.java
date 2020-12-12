package GameCharacters;

import GameClock.Subject;

public abstract class NPC extends Character
{
	DialogueBehavior dB;

	public NPC(String n, Subject s, Locations.Location l) {
		super(n, s, l);
	}

    public void performTalk()
    {
    	this.dB.talk();
    }
    
	public void setDialogueBehavior(DialogueBehavior db)
	{
		this.dB = db;
	}
    
	public abstract void defaultActivities() throws Exception;
}
