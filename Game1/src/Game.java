import java.util.Scanner;
public class Game {
    static boolean isGameFinished;
    Bedroom bedroom = new Bedroom();
    Bathroom bathroom = new Bathroom();
    Kitchen kitchen = new Kitchen();

    {
        bedroom.name = "Спальня";
        bedroom.description = "Просторная спальня с двуспальной кроватью";

        bathroom.name = "Ванная комната";
        bathroom.description = "Обычный совмещенный санузел";

        kitchen.name = "Кухня";
        kitchen.description = "Большая кухня с совмещенной столовой";
    }

    Room[] r = new Room[]{bedroom, bathroom, kitchen};

    public int showMenu (int menu){
        if (menu == 1) {
            System.out.println("Перейти в другую комнату");
        }
        else if (menu == 0){
            System.out.println("Выход");
        }
        else {
            System.out.println(showItems());
        }
        return menu;
        System.out.println(showMenu());
    }

    public int showRooms (int room){
     if (room == 1) {
         System.out.println (bedroom.name);
     }
     else if (room == 2) {
         System.out.println (bathroom.name);
     }
     else if (room == 3) {
         System.out.println (kitchen.name);
     }
        return room;
    }
    Scanner sc1 = new Scanner(System.in);
    menu.room = sc1.nextInt();

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в игру Дом, твоя цель - найти выход из дома");
        System.out.println("Придумайте имя: ");

        Player player = new Player();
        Scanner sc = new Scanner(System.in);
        player.name = sc.nextLine();

        Room room = new Room();

        int i;
      for (i = 0; i < 3; i++) {
          if (menu == 0){
              System.out.println(menu);
          } else if (menu == 1){
              System.out.println(showRooms());
          }
          if (isGameFinished == true){
              System.out.println("Поздравляем, вы победили!");
          }
      }
      }
        }
