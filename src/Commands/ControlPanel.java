package Commands;

public class ControlPanel {

	Command [] cmds;
	public ControlPanel(Command [] cmds) {
		this.cmds = cmds;
	}
	
	public void parse(String cmd){

		String op = cmd.split(" ")[0];
		
		for(int i = 0; i < cmds.length; i++)
		{
			if(cmds[i].isSynonym(op)) {
				cmds[i].execute(cmd);
			}
		}
		System.out.println("I do not understand that. You could try the help command");
	}
}
