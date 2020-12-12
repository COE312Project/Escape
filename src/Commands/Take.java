package Commands;

public class Take implements Command {

	String[] synonyms = new String[]{"take","pick-up", "grab","steal"};
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
		String cmd = args[0];

		for(Objects.Item i : this.player.loc.items) {
			if(arg.toLowerCase().contains(i.name)) {
				if(i.verbs.contains(cmd.toLowerCase())) {
					if(i.isException)
						i.use(cmd);
					this.player.inventory.add(i);
					this.player.loc.items.remove(i);
					i.acquired = true;
					System.out.println("\n\t<< "+i.name + " added to inventory! >>\n");
				}
				else
					System.out.println("\n\t<< You cannot do that! >>\n");
				return;
			}
		}
		System.out.println("\n\t<< You see no such thing! >>\n");
	}
}
