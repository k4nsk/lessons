public class Game {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в игру Дом, твоя цель - найти выход из дома");
        System.out.println("Придумайте имя: ");
        Player player = new Player();
        player.setName(player.getName());

        boolean isGameFinished = false;
        if (isGameFinished == false) {
            System.out.println("Игра не завершена");
        } else {
            System.out.println("Игра завершена");
        }

        Item items = new Item();
        items.displayInfo();
        items.name = "";
        items.description = "";

        Bedroom bedroom = new Bedroom();
        bedroom.name = "Спальня";
        bedroom.setName();
        bedroom.description = "Просторная спальня с двуспальной кроватью";
        bedroom.setDescription();

        Bathroom bathroom = new Bathroom();
        bathroom.name = "Ванная комната";
        bathroom.setName();
        bathroom.description = "Обычный совмещенный санузел";
        bathroom.setDescription();

        Kitchen kitchen = new Kitchen();
        kitchen.name = "Кухня";
        kitchen.setName();
        kitchen.description = "Большая кухня с совмещенной столовой";
        kitchen.setDescription();
        }
    }
