package Commands;

public class Use implements Command{

	String[] synonyms = new String[]{"use","play","access","login","eat","throw","cut","saw","pick","steal","map","check","show","sleep"};
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
					if(player.loc.name.equalsIgnoreCase(i.locName) || i.locName == "") {
						if(cmd.equalsIgnoreCase("throw") && arg.toLowerCase().contains("food"))
							player.loc.commotion = true;
						i.use(cmd);
						if(i.isExpendable)
							player.inventory.remove(i);
					}
					else
						System.out.println("\n\t<< You cannot "+ cmd +" "+ i.name +" here! >>\n");
				}
				else
					System.out.println("\n\t<< You cannot do that! >>\n");
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
						System.out.println("\n\t<< You cannot do that! >>\n");
				}
				else
					System.out.println("\n\t<< No such item in your inventory! >>\n");
				return;
			}
		}
		System.out.println("\n\t<< You neither see nor have any such thing! >>\n");
	}
}
