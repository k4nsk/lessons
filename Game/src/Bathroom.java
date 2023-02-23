public class Bathroom extends Room {
    private Item[] items = new Item[]{new Item[]("Зеркало"), ("Круглое зеркало над раковиной"),
            new Item[] ("Раковина"), ("Белая керамическая раковина")};

    @Override
    public void printItems() {
        int i;
        for (i = 0; i < items.length; i++) {
            System.out.println(items[i]);
            printItems();
            System.out.println("Претметы в комнате " + name + ": " + items[i]);
        }
    }
}
