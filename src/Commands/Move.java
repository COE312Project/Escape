package Commands;
import Locations.*;

public class Move implements Command {

	String[] synonyms = new String[]{"move","go","walk","proceed","advance"};
	String[] args;
	CurrentLocation curr;

	public Move(CurrentLocation l) {
		this.curr = l;
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
			curr.loc = curr.loc.north;	curr.loc.enter();
		}
		else if(arg.toLowerCase().contains("south") && curr.loc.south != null){
			curr.loc = curr.loc.south;	curr.loc.enter(); 
		}
		else if(arg.toLowerCase().contains("east") && curr.loc.east != null) {
			curr.loc = curr.loc.east;	curr.loc.enter(); 
		}
		else if(arg.toLowerCase().contains("west") && curr.loc.west != null){ 
			curr.loc = curr.loc.west;	curr.loc.enter(); 
		}
		else
			System.out.println("You cannot go there!"); 
	}
}
