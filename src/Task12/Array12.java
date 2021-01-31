package Task12;

import java.util.Arrays;

public class Array12 {
    public static void main(String[] args) {
        //Отсортировать строки по возрастанию и убыванию значений элементов.
        int array[][] = {{5, 2, 1, 7}, {4, 6, 2, 3}, {9, 8, 7, 6}};
        System.out.println("Исходный массив;");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));

        }
        boolean isSorting = false;
        while (!isSorting) {
            isSorting = true;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length - 1; j++) {
                    if (array[i][j] > array[i][j + 1]) {
                        isSorting = false;
                        int t = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = t;

                    }
                }
            }
        }
        System.out.println("Массив отсротированный по возрастанию строк:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        boolean x = false;
        while (!x) {
            x = true;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length - 1; j++) {
                    if (array[i][j] < array[i][j + 1]) {
                        x = false;
                        int t = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = t;

                    }
                }
            }
        }
        System.out.println("Массив отсротированный по убыванию строк:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
