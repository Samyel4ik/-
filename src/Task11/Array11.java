package Task11;

import java.util.Arrays;
import java.util.Random;

public class Array11 {
    public static void main(String[] args) {
        //Матрицу 10x20 заполнить случайными числами от 0 до 15.
        // Вывести на экран саму матрицу и номера строк, в которых число 5 встречается и более раз.
        int array[][] = new int[10][20];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(15);
            }
        }
        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        int array1[] = new int[10];                             // подсчитываем сколько чисел 5 в каждой строке и запиисываем в новый массив.
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] == 5) {
                    array1[i]++;
                }
            }
        }
        System.out.println("Количество 5 -ок в каждой строке исходного массива:");
        System.out.println(Arrays.toString(array1));

        int line = 0;                                                       // выводим номера строк где число 5 встечаеться больше 1 раза.
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > 1) {
                line = i + 1;
                System.out.println("Строки в которых число 5 встречаеться более 1 раза:" + line);
            }
        }
    }
}
