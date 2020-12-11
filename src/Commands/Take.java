package Commands;

public class Take implements Command {

	String[] synonyms = new String[]{"take","pick-up", "grab"};
	String[] args;
	GameCharacters.Player player;

	public Take(GameCharacters.Player p) {
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

		for(Objects.Item i : this.player.loc.items) {
			if(arg.toLowerCase().contains(i.name)) {
				this.player.inventory.add(i);
				this.player.loc.items.remove(i);
				System.out.println(i.name + " added to inventory!");
				return;
			}
		}
		System.out.println("You see no such thing!");
	}
}
