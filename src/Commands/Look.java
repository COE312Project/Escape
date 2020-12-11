package Commands;

import GameCharacters.Player;

public class Look implements Command {

	String[] synonyms = new String[]{"look","see"};
	String[] args;
	Player player;

	public Look(Player p) {
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
		if((this.player.time >= 19 || this.player.time <= 6) && this.player.loc.nightDesc != "")
			System.out.println(this.player.loc.nightDesc);
		else
		{
			System.out.println(this.player.loc.desc);
			if(this.player.loc.nDesc != "")
				System.out.println(this.player.loc.nDesc);
			if(this.player.loc.sDesc != "")
				System.out.println(this.player.loc.sDesc);
			if(this.player.loc.eDesc != "")
				System.out.println(this.player.loc.eDesc);
			if(this.player.loc.wDesc != "")
				System.out.println(this.player.loc.wDesc);
		}
	}
}
