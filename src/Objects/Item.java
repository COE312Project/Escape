package Objects;

import java.util.ArrayList;

public abstract class Item {
    public String name;
    public String locName;
    public ArrayList<String> verbs = new ArrayList<String>();
    public Boolean mustBeTaken = false;
	public Boolean acquired = false;
	public Boolean isException = false;
	public Boolean isExpendable = false;
	public String desc = "";

    public Item(String n, String lN) {
        this.name = n;
        this.locName = lN;
        this.verbs.add("use");
    }
    
    public void canBeTaken() {
    	verbs.add("take");
    	verbs.add("grab");
    	verbs.add("pick-up");
    	this.mustBeTaken = true;
    }
    
    public abstract void use(String verb);
}
