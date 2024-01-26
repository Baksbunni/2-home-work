import java.util.Arrays;
import java.util.stream.IntStream;

public class Task8 {
    public static void main(String[] args) {
        //Работа в классе.
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
        int[] bigBox = {5, 6, 12};
        System.out.println(bigBox[0]);
        int[] houses = new int[7];
        houses[0] = 5;
        houses[1] = 7;
        houses[6] = 10;
        System.out.println(houses[0]);
        System.out.println(houses[1]);
        System.out.println(houses[6]);
        {
        }
        // Задание 1.
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);
        for (int i = 0; i < weight.length; i++) {
            System.out.println(weight[i]);
        }
        double[] weight1 = {1.57, 7.654, 9.986};
        weight1[0] = 1.57;
        weight1[1] = 7.654;
        weight1[2] = 9.986;
        System.out.println(weight1[0]);
        System.out.println(weight1[1]);
        System.out.println(weight1[2]);

        int[] free = new int[10];
        free[2] = 5;
        free[4] = 6;
        free[7] = 8;
        System.out.println(free[2]);
        System.out.println(free[4]);
        System.out.println(free[7]);
        //Задача 2.
        int[] arr1 = {1, 2, 3};
        for (int i = 0; i < arr1.length ; i++) {
            System.out.print(arr1[i]);
            if (i != arr1.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        double[] arr2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i != arr2.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        int[] arr3 = {5, 6, 8};
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if (i != arr3.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        // Задача 3.
        int[] arr4 = {1, 2, 3};
        for (int i = arr4.length - 1; i >= 0 ; i--) {
            System.out.print(arr4[i]);
            if (i != 0){
                System.out.print(",");
            }
        }
        System.out.println();
        double[] arr5 = {1.57, 7.654, 9.986};
        for (int i = arr5.length - 1; i >= 0; i--) {
            System.out.print(arr5[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        int[] arr6 = {5, 6, 8};
        for (int i = arr6.length - 1; i >= 0 ; i--) {
            System.out.print(arr6[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        // Задача 4.
        int[] array1 = {1, 2, 3};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                array1[i]+= 1;
            }
        }
        System.out.print(Arrays.toString(array1));
        System.out.println();
        int[] array3 = {5, 6, 8};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] % 2 != 0) {
                array3[i] += 1;
            }
        }
        System.out.println(Arrays.toString(array3));
    }
}
