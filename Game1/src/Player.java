public class Player {
    String name;
    String inventory;
    private Item[] items = new Item[10];

    public String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;

    }
}
