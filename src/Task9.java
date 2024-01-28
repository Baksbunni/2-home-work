import java.util.Arrays;
import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        // Задача 1.
        int[] ints = generateRandomArray();
        System.out.println(Arrays.toString(ints));
        int result = 0;
        for (int accounting : ints) {
            result = result + accounting;
        }
        System.out.println("Сумма трат за месяц составила " + result + " рублей");
        System.out.println();
        // Задача 2 - 3.
        int[] expenses = generateRandomArray();
        int totalExpense = 0;
        int minExpense = expenses[0];
        int maxExpense = expenses[0];
        for (int i = 0; i < expenses.length; i++) {
            totalExpense += expenses[i];
            if (expenses[i] < maxExpense) {
                minExpense = expenses[i];
            }
            if (expenses[i] > maxExpense) {
                maxExpense = expenses[i];
            }
        }
        double resultAverage = (double) totalExpense / expenses.length;
        System.out.println("Средняя сумма трат за месяц составила " +  resultAverage + " рублей");

        System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxExpense + " рублей");
        System.out.println();
        // Задача 4.
        char[] reversFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reversFullName.length - 1; i >= 0; i--) {
            System.out.print(reversFullName[i]);
        }
    }
    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000 + 1) + 100_000;
        }
        return arr;
    }
}
