package collectionsiterator;

public class ChristmasPresent {
    private String name;
    private String description;
    private int price;

    public ChristmasPresent(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }
}
