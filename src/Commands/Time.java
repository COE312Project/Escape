package Commands;

import GameCharacters.Player;

public class Time implements Command {

	String[] synonyms = new String[]{"time","clock"};
	String[] args;
	Player player;

	public Time(Player p) {
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
		int time = player.time % 12;
		if (time == 0) time=12;
		
		System.out.println("\n\t<< " + time +":00" +((player.time <12)?" AM":" PM") + " >>\n");
		//System.out.println(player.time);
	}
}
