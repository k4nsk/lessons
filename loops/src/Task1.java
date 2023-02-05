
public class Task1 {
    public static void main(String[] args) {

        String[] names;
        names = new String[]{"John", "Bob", "Mary", "Peter", "Sarah"};


        for (int i = 0; i < (names[i].length()); i++) {
            if ((names[i].length()) < 4) {
                System.out.println("Ваше имя меньше 4 букв:" + names[i]);
            } else if ((names[i].length()) > 4) {
                System.out.println("Ваше имя больше 4 букв:" + names[i]);
            } else if ((names[i].length()) == 4) {
                System.out.println("Ваше имя состоит из 4 букв:" + names[i]);
            }
        }

    }
}
