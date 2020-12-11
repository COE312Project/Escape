package GameCharacters;

public class TalkToInteractiveNPC extends DialogueBehavior
{
	String dialogue = "...\n";
	//needs to be changed with respect to game completion state
	public TalkToInteractiveNPC(String d)
	{
		this.dialogue = d;
	}
	
	public void talk()
	{
		System.out.println(dialogue);
	}
	
}
