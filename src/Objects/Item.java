package Objects;

public abstract class Item {
    String name;
    Item(String n) {
        this.name = n;
    }
    
    public abstract void use(String verb);
}
