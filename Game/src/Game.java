import java.util.Scanner;
public class Game {
    static boolean isGameFinished;
    Bedroom bedroom = new Bedroom();
    Bathroom bathroom = new Bathroom();
    Kitchen kitchen = new Kitchen();

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    bedroom.setName("Спальня");
    bedroom.setDescription("Просторная спальня с двуспальной кроватью");

    bathroom.setName("Ванная комната");
    bathroom.setDescription("Обычный совмещенный санузел");

    kitchen.setName("Кухня");
    kitchen.setDescription("Большая кухня с совмещенной столовой");


    Room[] r = new Room[]{bedroom, bathroom, kitchen};

    public int showMenu() {
        System.out.println("1. Перейти в другую комнату");
        System.out.println("0. Выход");
        System.out.println("2. Показать интентарь");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
        return a;
    }

    public void showRooms() {
        for (int i = 0; i < r.length; i++){
            r[i].print();
            System.out.println(r[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в игру Дом, твоя цель - найти выход из дома");
        System.out.println("Придумайте имя: ");

        Player player = new Player();
        Scanner sc = new Scanner(System.in);
        player.name = sc.nextLine();


        Room room = new Room();

        for (; ;) {
            if (a == 0){
                this.showMenu();
                System.out.println("Выйти из игры");
            } else if (a == 1){
                this.showRooms;
            } else if (a == 2){
                this.showItems();
            }
        }
    }
}
