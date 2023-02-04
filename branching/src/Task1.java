import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Результат экзамена:");
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();

        if ((result == 1) || (result == 25) || ((result > 1) && (result < 25))) {
            System.out.println("Плохо");
        }

        if ((result == 26) || (result == 50) || ((result > 26) && (result < 50))) {
            System.out.println("Ниже среднего");
        }

        if ((result == 51) || (result == 75) || ((result > 51) && (result < 75))) {
            System.out.println("Выше среднего");
        }

        if ((result == 76) || (result == 100) || ((result > 76) && (result < 100))){
            System.out.println("Отлично");
        }

        if ((result < 1) || (result > 100)) {
            System.out.println("Ошибка");
        }
    }
}