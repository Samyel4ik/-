package Task9;

import java.util.Arrays;
import java.util.Random;

public class Array9 {
    public static void main(String[] args) {
        // Задана матрица неотрицательных чисел.
        // Посчитать сумму элементов в каждом столбце.
        // Определить, какой столбец содержит максимальную сумму.
        int n = 5;
        int array[][] = new int[n][n];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        int summ0 = 0;
        int summ1 = 0;
        int summ2 = 0;
        int summ3 = 0;
        int summ4 = 0;

        for (int i = 0; i < array.length; i++) {
            summ0 += array[i][0];
            summ1 += array[i][1];
            summ2 += array[i][2];
            summ3 += array[i][3];
            summ4 += array[i][4];
        }
        System.out.println("Сумма первого столбца:" + summ0);
        System.out.println("Сумма второго столбца:" + summ1);
        System.out.println("Сумма третьего столбца:" + summ2);
        System.out.println("Сумма четвертого столбца:" + summ3);
        System.out.println("Сумма пятого столбца:" + summ4);

        int[] array1 = {summ0, summ1, summ2, summ3, summ4};
        int max = array1[0];
        int line = 0;
        for (int i = 0; i < array1.length; i++) {
            if (max < array1[i]) {
                max = array1[i];
                line = i + 1;
            }
        }
        System.out.println("Номер столбца:" + line + " Максимальное сумма в столбце:" + max);
    }
}
