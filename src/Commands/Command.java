package Commands;

public interface Command
{
	public void execute(String args);
	public Boolean isSynonym(String cmd);
}

