package Task13;

import java.util.Arrays;

public class Array13 {
    public static void main(String[] args) {
        //Отсортировать стобцы матрицы по возрастанию и убыванию значений эементов.
        int array[][] = {{48,47,48,49},{1, 2, 3, 4}, {0, 10, 12, 13}, {51, 52, 53, 54}};

        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        boolean t = false;
        while (!t) {
            t=true;
            for (int i = 0; i < array.length-1; i++) {          //по убыванию
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j]<array[i+1][j]){
                        t = false;
                        int b = array[i][j];
                        array[i][j]=array[i+1][j];
                        array[i+1][j]=b;

                    }
                }
            }
        }
        System.out.println("Массив столбцы по убыванию:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        boolean y = false;
        while (!y) {
            y=true;
            for (int i = 0; i < array.length-1; i++) {          //по возрастанию
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j]>array[i+1][j]){
                        y = false;
                        int b = array[i][j];
                        array[i][j]=array[i+1][j];
                        array[i+1][j]=b;

                    }
                }
            }
        }
        System.out.println("Массив стобцы по возрастанию:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
