public class DoWhile {
    static public void main(String[] args) {
        String[] names = new String[]{"John", "Bob", "Mary", "Peter", "Sarah"};

        int i = 0;
            do {
                if ((names[i].length() < 4))
                    System.out.println("Ваше имя меньше 4 букв:" + names[i]);
                else if ((names[i].length() > 4))
                    System.out.println("Ваше имя больше 4 букв:" + names[i]);
                else if ((names[i].length() == 4))
                    System.out.println("Ваше имя состоит 4 букв:" + names[i]);
                i++;
            } while ((names[i].length() < 4) || (names[i].length() > 4) || (names[i].length() == 4)) ;

        }
    }
