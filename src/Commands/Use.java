package Commands;

public class Use implements Command{

	String[] synonyms = new String[]{"use","play","access","login","eat","throw","cut","saw","pick","steal","map","check"};
	String[] args;
	GameCharacters.Player player;

	public Use(GameCharacters.Player p) {
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

		for(Objects.Item i : this.player.inventory) {
			if(arg.toLowerCase().contains(i.name)) {
				if(i.verbs.contains(cmd.toLowerCase())) {
					i.use(cmd);
				}
				else
					System.out.println("You cannot do that!");
				return;
			}
		}

		for(Objects.Item i : this.player.loc.items) {
			if(arg.toLowerCase().contains(i.name)) {
				if(!i.mustBeTaken) { 
					if(i.verbs.contains(cmd.toLowerCase())) {
						i.use(cmd);
					}
					else
						System.out.println("You cannot do that!");
				}
				else
					System.out.println("No such item in your inventory!");
				return;
			}
		}
		System.out.println("You neither see nor have any such thing!");
	}
}
