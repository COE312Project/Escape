package GameCharacters;

import GameClock.Subject;

public abstract class NPC extends Character
{
	DialogueBehavior dB;

	public NPC(String n, Subject s) {
		super(n, s);
	}

    public void performTalk()
    {
    	this.dB.talk();
    }
    
	public void setDialogueBehavior(DialogueBehavior db)
	{
		this.dB = db;
	}
    
	public abstract void defaultActivities();
}
