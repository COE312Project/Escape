package Commands;
import Locations.*;

public class Move implements Command {

	String[] synonyms = new String[]{"move","go","walk","proceed","advance"};
	String[] args;
	CurrentLocation curr;
	GameCharacters.Player player;
	public Move(CurrentLocation l, GameCharacters.Player p) {
		this.curr = l;
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

		if (arg.toLowerCase().contains("north") && curr.loc.north != null){ 
			curr.loc.prisoners.remove(player);
			curr.loc = curr.loc.north;	
			player.loc = curr.loc; 
			curr.loc.prisoners.add(player);
			curr.loc.enter();
		}
		else if(arg.toLowerCase().contains("south") && curr.loc.south != null){

			curr.loc.prisoners.remove(player);
			curr.loc = curr.loc.south;	
			player.loc = curr.loc; 
			curr.loc.prisoners.add(player);
			curr.loc.enter(); 
		}
		else if(arg.toLowerCase().contains("east") && curr.loc.east != null) {
			curr.loc.prisoners.remove(player);
			curr.loc = curr.loc.east;
			player.loc = curr.loc; 
			curr.loc.prisoners.add(player);
			curr.loc.enter(); 
		}
		else if(arg.toLowerCase().contains("west") && curr.loc.west != null){ 
			curr.loc.prisoners.remove(player);
			curr.loc = curr.loc.west;
			player.loc = curr.loc; 
			curr.loc.prisoners.add(player);
			curr.loc.enter(); 
		}
		else
			System.out.println("You cannot go there!"); 
	}
}
