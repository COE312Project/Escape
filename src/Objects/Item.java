package Objects;

import java.util.ArrayList;

public abstract class Item {
    public String name;
    public ArrayList<String> verbs = new ArrayList<String>();
    public Boolean mustBeTaken = false;
	public Boolean acquired = false;
	public Boolean isException = false;

    public Item(String n) {
        this.name = n;
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
