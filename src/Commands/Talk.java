package Commands;

import GameCharacters.*;
import Objects.Item;

public class Talk implements Command {

	String[] synonyms = new String[]{"talk","speak-to"};
	String[] args;
	Player player;

	public Talk(Player p) {
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
		this.args = arg.split(" ");
		String cmd = args[0];

		for(Prisoner p : this.player.loc.prisoners) {

			if(arg.toLowerCase().contains(p.name.toLowerCase())) {
				p.talk();
				return;
			}
		}
		
		for(Guard g : this.player.loc.guards) {

			if(arg.toLowerCase().contains(g.name.toLowerCase())) {
				g.talk();
				return;
			}
		}
		
		System.out.println("\n\t<< You see no such person! >>\n");
	}
}
