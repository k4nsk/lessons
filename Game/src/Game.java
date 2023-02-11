import java.util.Scanner;
public class Game {
    String room1 = "Ванная комната";
    String roomdescription1 = "Обычный совмещенный санузел";

    String room2 = "Спальня";
    String roomdescription2 = "Просторная спальня с двуспальной кроватью";

    String room3 = "Кухня";
    String roomdescription3 = "Большая кухня с совмещенной столовой";

    public static void main(String[] args) {
        System.out.println ("Добро пожаловать в игру Дом, твоя цель - найти выход из дома");
        Player player1 = new Player();
        Scanner sc = new Scanner (System.in);
        String name1 = sc.nextLine();
        player1.name0(name1);

        
        GameFinished isGameFinished = new GameFinished();
        isGameFinished.isGameFinished1();

        Item name = new Item();
        Item description =new Item();
        name.setName(name.getName());
        description.setDescription(description.getDescription());


        Bedroom bedroom1 = new Bedroom ();
        bedroom1.setName(bedroom1.getName());
        bedroom1.setDescription(bedroom1.getDescription());

        Kitchen kitchen1 = new Kitchen();
        kitchen1.setName(kitchen1.getName());
        kitchen1.setDescription(kitchen1.getDescription());

        Bathroom bath1 = new Bathroom();
        bath1.setName(bath1.getName());
        bath1.setDescription(bath1.getDescription());





    }
}
class GameFinished {
    boolean a; boolean b;
    void isGameFinished1() {
        if (a == false) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}

class Item {
    private String name;
    private String description;

    public String getName() {
        return name;
    }
    void setName (String name){
        this.name = name;
        }

        public String getDescription(){
        return description;
        }
        void setDescription (String description){
        this.description = description;
        }
    }


    class Bedroom {
        private String name;
        private String description;
        String [][] items = new String[][]{
                {"Окно", "Тумбочка", "Кровать"},

                {"Окно с ручкой в дальней стене",
                "Деревянная тумбочка у кровати",
                "Незаправленная кровать из Икеи"}
        };

        public String getName() {
            return name;
        }
        void setName (String name){
            this.name = name;
        }
        public String getDescription (){
            return description;
        }
        void setDescription (String description){
            this.description = description;
        }

    }

    class Kitchen {
        private String name;
        private String description;
        String [][] items = new String[][]{
                {"Выдвижной ящик"},

                {"Верхний ящик под столешницей"}
        };
        public String getName() {
            return name;
        }
        void setName (String name){
            this.name = name;
        }

        public String getDescription (){
            return description;
        }
        void setDescription (String description){
            this.description = description;
        }

    }

    class Bathroom {
        private String name;
        private String description;
        String[][] items = new String[][]{
                {"Зеркало", "Раковина"},

                {"Круглое зеркало над раковиной",
                        "Белая керамическая раковина"}
        };
        public String getName() {
            return name;
        }
        void setName (String name){
            this.name = name;
        }
        public String getDescription (){
            return description;
        }
        void setDescription (String description){
            this.description = description;
        }
    }

    class Player{
    String name;
    String inventory;
    String[] items1 = new String[10];
        void name0 (String name) {
            System.out.println("Придумайте имя: " + name);
        }
    }