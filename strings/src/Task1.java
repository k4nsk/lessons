public class Task1 {
    public static void main(String[] args) {
        System.out.println("Выведите 5 чисел:");
        int[] numbers = new int[]{11, 23, 44, 68, 99};

        for (int x = 0; x < numbers.length; x++) {
            if (numbers[x] % 2 == 0) {
                System.out.println("Число x - четное: " + numbers[x]);
            } else if (numbers[x] % 2 != 0) {
                System.out.println("Число x - нечетное: " + numbers[x]);

            }
        }

    }
}
