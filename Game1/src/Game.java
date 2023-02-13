import java.util.Scanner;
public class Game {
    boolean isGameFinished = false;
        if(isGameFinished == false) {
            System.out.println("Игра не завершена");
    } else {
            System.out.println("Игра завершена");
        }

    {
        Bedroom bedroom = new Bedroom();
        bedroom.name = "Спальня";
        bedroom.description = "Просторная спальня с двуспальной кроватью";

        Bathroom bathroom = new Bathroom();
        bathroom.name = "Ванная комната";
        bathroom.description = "Обычный совмещенный санузел";

        Kitchen kitchen = new Kitchen();
        kitchen.name = "Кухня";
        kitchen.description = "Большая кухня с совмещенной столовой";
    }

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в игру Дом, твоя цель - найти выход из дома");
        System.out.println("Придумайте имя: ");

        Player player = new Player();
        Scanner sc = new Scanner(System.in);
        player.name = sc.nextLine();

        Item items = new Item();

        Bedroom bedroom = new Bedroom();
        bedroom.toString(items);

        Bathroom bathroom = new Bathroom();
        bathroom.toString(items);

        Kitchen kitchen = new Kitchen();
        kitchen.toString(items);

        }
}
