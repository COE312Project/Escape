package Commands;

public class Help implements Command {

	String[] synonyms = new String[]{"help"};
	String[] args;
	

	

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
	
		System.out.println("\n\t<< You can walk around, have a look, talk to people, pick-up things and use them! You are only limited by your imagination! >>");
	}
}
