import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите сообщение:");
        Scanner sc = new Scanner(System.in);
        String message = sc.next();

        System.out.println("Введите число:");
        int num = sc.nextInt();

        char[] array = new char[message.length()];
        for (int i = 0; i < message.length(); i++){
            array[i] = (char) ((int) (message.charAt(i)) + num);
        }
        System.out.println(array);

        String g = String.valueOf(array);
        String mes = String.format("%nИсходное значие: %s", message);
        String mes2 = String.format("Зашифрованное сообщение: %s", g);
        String mes3 = String.format("Шифр: %d", num);
        System.out.println(mes);
        System.out.println(mes2);
        System.out.println(mes3);
            }
    }