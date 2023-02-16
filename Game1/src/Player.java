public class Player {
    String name;
    String inventory;
    private Item[] items = new Item[10];

    Room currentRoom = new Room();

    public void setCurrentRoom(Room currentRoom){
        this.currentRoom = currentRoom;
        System.out.println("Вы перешли в комнату " + currentRoom);
       public void showItems (String){
           System.out.println(inventory);
        }
    }
    }