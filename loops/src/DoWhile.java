public class DoWhile {
    static public void main (String [] args){
        String[] names = new String[]{"John", "Bob", "Mary", "Peter", "Sarah"};

        int a = 0;
        a++;
        do  {
            System.out.println("Ваше имя меньше 4 букв:" + names[a]);
            a++;
        }
        while ((names[a].length()) < 4);


        do {
            System.out.println("Ваше имя больше 4 букв:" + names[a]);
            a++;
        }
        while ((names[a].length()) > 4);


        do {
            System.out.println("Ваше имя состоит из 4 букв:" + names[a]);
            a++;
        }
        while ((names[a].length()) == 4);
    }
}
