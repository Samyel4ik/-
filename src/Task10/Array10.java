package Task10;

import java.util.Arrays;
import java.util.Random;

public class Array10 {
    public static void main(String[] args) {
        //Найти положительные элементы главной диагонали квадратной матрицы.
        int array[][] = new int[5][5];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10) - 5;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("Положительные элементы гавной диогонали:");
        for (int i = 0; i < array.length; i++) {
            if (array[i][i] > 0) {
                System.out.print(array[i][i] + " ");
            }
        }
    }
}
