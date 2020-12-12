package Commands;
import Locations.*;

public class Move implements Command {

	String[] synonyms = new String[]{"move","go","walk","proceed","advance"};
	String[] args;
	CurrentLocation curr;
	GameCharacters.Player player;
	GameAssets.GameMap map;
	public Move(CurrentLocation l, GameCharacters.Player p, GameAssets.GameMap map) {
		this.curr = l;
		this.player = p;
		this.map = map;
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
			if(curr.loc.north.isLocked && curr.loc.name.equals("Cell")) { System.out.println("\n\t<< Maybe if you didn't eat so much, you'd fit through those bars! >>\n"); return;}
			if(curr.loc.north.isLocked) {System.out.print("\n[Guard]:\n\t❝  You there! Get away from the construction zone! ❞\n"); return;	}
			curr.loc.prisoners.remove(player);
			curr.loc = curr.loc.north;	
			player.loc = curr.loc; 
			curr.loc.prisoners.add(player);
			curr.loc.enter();
		}
		else if(arg.toLowerCase().contains("south") && curr.loc.south != null){
			if(curr.loc.south.isLocked) {System.out.println("\n<< " + curr.loc.name + " is locked! Do you have a key or something *better*? >>\n"); return;	}
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
			if(curr.loc.west.isLocked) {System.out.println("\n<< " + curr.loc.west.name + " is locked! Do you have a key? >>\n"); return;	}
			curr.loc.prisoners.remove(player);
			curr.loc = curr.loc.west;
			player.loc = curr.loc; 
			curr.loc.prisoners.add(player);
			curr.loc.enter(); 
		}
		else
			System.out.println("\n<< You cannot go there! >>\n"); 

		//	if(player.inventory.contains(map))
		map.setLocation(curr.loc.name);
	}
}
