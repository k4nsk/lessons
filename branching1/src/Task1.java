import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Результат экзамена:");
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();

        if (((result > 0) && (result < 26))) {
            System.out.println("Плохо");
        }

        else if (((result > 25) && (result < 51))) {
            System.out.println("Ниже среднего");
        }

        else if (((result > 50) && (result < 76))) {
            System.out.println("Выше среднего");
        }

        else if (((result > 75) && (result < 101))){
            System.out.println("Отлично");
        }

        else if (result < 1) {
            System.out.println("Ошибка");
        }

        else {
            System.out.println("Ошибка");
        }
    }
}