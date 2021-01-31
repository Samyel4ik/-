package Task1;

import java.util.Arrays;
import java.util.Random;

public class Array1 {
    public static void main(String[] args) {
        //. Дана матрица. Вывести на экран все нечетные столбцы,
        // у которых первый элемент больше последнего.
        int[][] array = new int[5][6];

        Random random = new Random();
        System.out.println("Исходный массив");
        for (int i = 0; i < array.length; i++) {            //заполнение массива
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Нечетные столбцы у которых первое число больше второго");

        for (int i = 0; i < array.length; i++) {           // поиск нечетных столбцов
            for (int j = 0; j < array[i].length; j = j + 2) {
                if (array[0][j] > array[4][j])
                    System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
