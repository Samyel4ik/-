package Task15;

import java.util.Arrays;
import java.util.Random;

public class Array15 {
    public static void main(String[] args) {
        //Найдите наибольший элемент матрицы и замените все нечетные элементы на него.
        int array[][] = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50) - 25;
            }
        }
        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        int maxNum = array[0][0];                            // поиск максимального значения
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (maxNum < array[i][j]) {
                    maxNum = array[i][j];
                }
            }
        }
        System.out.println("Максимальное число массива:" + maxNum);

        for (int i = 0; i < array.length; i++) {                    //нахождение отрицательных эл.
            for (int j = 0; j < array[i].length; j++) {             // замена на мах.
                if (array[i][j] < 0) {
                    array[i][j] = maxNum;
                }
            }
        }
        System.out.println("Измененный массив:");                  // вывод измененного масива.
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
