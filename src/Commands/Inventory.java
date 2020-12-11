package Commands;

import Objects.Item;

public class Inventory implements Command {

	String[] synonyms = new String[]{"inventory","bag"};
	String[] args;
	GameCharacters.Player player;

	public Inventory(GameCharacters.Player p) {
		this.player = p;
	}

	public Boolean isSynonym(String cmd)
	{
		for(String s:this.synonyms)
			if(cmd.equalsIgnoreCase(s))
				return true;
		return false;
	}

	public void execute(String arg)
	{
		if(!player.inventory.isEmpty())
		{
			System.out.print("[[ ");
			for (Item i: this.player.inventory)
			{
				System.out.print(i.name + " ");
			}
			System.out.println("]]");
		}
		else
		{
			System.out.println("The "+arg+" is empty!\n");
		}
	}
}
