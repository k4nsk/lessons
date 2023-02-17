import java.util.Scanner;
public class Game {
    static boolean isGameFinished;
    Bedroom bedroom = new Bedroom();
    Bathroom bathroom = new Bathroom();
    Kitchen kitchen = new Kitchen();

    protected String name;
    protected String description;

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
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
        return a;
    }

    public int showRooms() {
        System.out.println(r.toString());
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        int getNumber() {
            return b;
    }

}

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в игру Дом, твоя цель - найти выход из дома");
        System.out.println("Придумайте имя: ");

        Player player = new Player();
        Scanner sc = new Scanner(System.in);
        player.name = sc.nextLine();


        Room room = new Room();

        int a;
        for (a = 0; a < 3; a++) {
            if (a == 0){
                System.out.println(a);
            } else if (a == 1){
                System.out.println(showRooms());
            }
            if (isGameFinished == true){
                System.out.println("Поздравляем, вы победили!");
            }
        }
    }
}
