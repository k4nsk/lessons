import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Количество денег заработанных компанией Health: ");
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        String name = "Health";

        int tax = income / 100 * 7;
        int a = tax * 100 / income;

        int tax2 = income / 100 * 12;
        int b = tax2 * 100 / income;

        int tax3 = income / 100 * 15;
        int c = tax3 * 100 / income;

        if (income < 400000) {
            System.out.println("Налог на сумму" + " " + income + " " +
                    "для отрасли" + " " + name + " " +
                    "составляет" + " " + tax + "." + " " +
                    "Это составляет" + " " + a + " " + "процентов" + ".");
        } else if (income == 400000) {
            System.out.println("Налог на сумму" + " " + income + " " +
                    "для отрасли" + " " + name + " " +
                    "составляет" + " " + tax2 + "." + " " +
                    "Это составляет" + " " + b + " " + "процентов" + ".");
        } else if (income > 400000) {
            System.out.println("Налог на сумму" + " " + income + " " +
                    "для отрасли" + " " + name + " " +
                    "составляет" + " " + tax2 + "." + " " +
                    "Это составляет" + " " + b + " " + "процентов" + ".");
        } else if (income < 899999) {
            System.out.println("Налог на сумму" + " " + income + " " +
                    "для отрасли" + " " + name + " " +
                    "составляет" + " " + tax2 + "." + " " +
                    "Это составляет" + " " + b + " " + "процентов" + ".");
        } else if (income == 900000) {
            System.out.println("Налог на сумму" + " " + income + " " +
                    "для отрасли" + " " + name + " " +
                    "составляет" + " " + tax3 + "." + " " +
                    "Это составляет" + " " + c + " " + "процентов" + ".");
        } else if (income > 900000) {
            System.out.println("Налог на сумму" + " " + income + " " +
                    "для отрасли" + " " + name + " " +
                    "составляет" + " " + tax3 + "." + " " +
                    "Это составляет" + " " + c + " " + "процентов" + ".");
        }

        System.out.println("Количество денег заработанных компанией Bank: ");


        int income1 = sc.nextInt();
        String name1 = "Bank";

        int tax1 = income1 / 100 * 10;
        int a1 = tax1 * 100 / income1;

        int tax22 = income1 / 100 * 15;
        int b1 = tax22 * 100 / income1;

        int tax33 = income1 / 100 * 18;
        int c1 = tax33 * 100 / income1;


        if (income1 < 250000) {
            System.out.println("Налог на сумму" + " " + income1 + " " +
                    "для отрасли" + " " + name1 + " " +
                    "составляет" + " " + tax1 + "." + " " +
                    "Это составляет" + " " + a1 + " " + "процентов" + ".");
        }


        else if ((income1 == 250000) || (income1 == 499999) || ((income1 > 250000) && (income1 < 499999))) {
            System.out.println("Налог на сумму" + " " + income1 + " " +
                    "для отрасли" + " " + name1 + " " +
                    "составляет" + " " + tax22 + "." + " " +
                    "Это составляет" + " " + b1 + " " + "процентов" + ".");
        }


        else if (income1 == 900000) {
            System.out.println("Налог на сумму" + " " + income1 + " " +
                    "для отрасли" + " " + name1 + " " +
                    "составляет" + " " + tax33 + "." + " " +
                    "Это составляет" + " " + c1 + " " + "процентов" + ".");
        }

        else if (income1 > 900000) {
            System.out.println("Налог на сумму" + " " + income1 + " " +
                    "для отрасли" + " " + name1 + " " +
                    "составляет" + " " + tax33 + "." + " " +
                    "Это составляет" + " " + c1 + " " + "процентов" + ".");
        }


        System.out.println("Количество денег заработанных компанией Transport: ");


        int income11 = sc.nextInt();
        String name11 = "Transport";

        int tax11 = income11 / 100 * 9;
        int a11 = tax11 * 100 / income11;

        int tax222 = income11 / 100 * 13;
        int b11 = tax222 * 100 / income11;

        int tax333 = income11 / 100 * 17;
        int c11 = tax333 * 100 / income11;


        if (income11 < 100000) {
            System.out.println("Налог на сумму" + " " + income11 + " " +
                    "для отрасли" + " " + name11 + " " +
                    "составляет" + " " + tax11 + "." + " " +
                    "Это составляет" + " " + a11 + " " + "процентов" + ".");
        }


        else if ((income11 == 100000) || (income11 == 299999) || ((income11 > 100000) && (income11 < 299999))) {
            System.out.println("Налог на сумму" + " " + income11 + " " +
                    "для отрасли" + " " + name11 + " " +
                    "составляет" + " " + tax222 + "." + " " +
                    "Это составляет" + " " + b11 + " " + "процентов" + ".");
        }


        else if (income11 == 300000) {
            System.out.println("Налог на сумму" + " " + income11 + " " +
                    "для отрасли" + " " + name11 + " " +
                    "составляет" + " " + tax333 + "." + " " +
                    "Это составляет" + " " + c11 + " " + "процентов" + ".");
        }

        else if (income11 > 300000) {
            System.out.println("Налог на сумму" + " " + income11 + " " +
                    "для отрасли" + " " + name11 + " " +
                    "составляет" + " " + tax333 + "." + " " +
                    "Это составляет" + " " + c11 + " " + "процентов" + ".");
        }
    }
}