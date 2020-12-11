package Objects;

public abstract class Item {
    public String name;
    public Item(String n) {
        this.name = n;
    }
    
    public abstract void use(String verb);
}
