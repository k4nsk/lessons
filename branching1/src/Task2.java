import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Сфера:");
        String sphere = sc.nextLine();
        System.out.println("Доход:");
        int income = sc.nextInt();



            if ((sphere.equals("Health")) && (income <= 400000)) {
                System.out.println("Налог на сумму " + income +
                        " для отрасли " + sphere +
                        " составляет " + income * 0.07 + ". " +
                        "Это составляет 7 процентов.");
            }

            if ((sphere.equals("Health")) && (income >= 400000) && (income <= 899999)) {
                System.out.println("Налог на сумму " + income +
                        " для отрасли " + sphere +
                        " составляет " + income * 0.12 + ". " +
                        "Это составляет 12 процентов.");
            }

            if ((sphere.equals("Health")) && (income >= 900000)) {
                System.out.println("Налог на сумму " + income +
                        " для отрасли " + sphere +
                        " составляет " + income * 0.15 + ". " +
                        "Это составляет 15 процентов.");
            }

            if ((sphere.equals("Bank")) && (income < 250000)) {
                System.out.println("Налог на сумму " + income +
                        " для отрасли " + sphere +
                        " составляет " + income * 0.1 + ". " +
                        "Это составляет 10 процентов.");
            }

            if ((sphere.equals("Bank")) && (income >= 250000) && (income <= 499999)) {
                System.out.println("Налог на сумму " + income + " для отрасли " + sphere +
                        " составляет " + income * 0.15 + ". " +
                        "Это составляет 15 процентов.");
            }

            if ((sphere.equals("Bank")) && (income >= 500000)) {
                System.out.println("Налог на сумму " + income +
                        " для отрасли " + sphere +
                        " составляет " + income * 0.18 + ". " +
                        "Это составляет 18 процентов.");
            }

             if ((sphere.equals("Transport")) && (income <= 100000)) {
                    System.out.println("Налог на сумму " + income +
                            " для отрасли " + sphere +
                            " составляет " + income * 0.09 + ". " +
                            "Это составляет 9 процентов.");
                }
             if ((sphere.equals("Transport")) && (income >= 100000) && (income <= 299999)) {
                    System.out.println("Налог на сумму " + income
                                    + " для отрасли " + sphere +
                                    " составляет " + income * 0.13 + ". " +
                                    "Это составляет 13 процентов.");
                }
             if ((sphere.equals("Transport")) && (income >= 300000)) {
                    System.out.println("Налог на сумму " + income +
                                    " для отрасли " + sphere +
                                    " составляет " + income * 0.17 + ". " +
                                    "Это составляет 17 процентов.");
                }
            }
        }
