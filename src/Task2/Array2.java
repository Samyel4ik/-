package Task2;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        //Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
        int[][] array = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        System.out.println("Числа по диогонали:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + " ");
        }
    }
}
