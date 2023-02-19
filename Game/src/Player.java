public class Player {
    String name;
    String inventory;
    private Item[] items = new Item[10];

    Room currentRoom = new Room();

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
        System.out.println("Вы перешли в комнату " + currentRoom);
    }

    public void showItems (Item[] items) {
        for (int i = 0; i < items.length; i++) {
            items[i].print();
            System.out.println(items[i]);
        }
    }
}
