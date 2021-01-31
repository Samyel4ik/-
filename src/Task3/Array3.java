package Task3;

import java.util.Random;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        // Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
        Scanner num = new Scanner(System.in);
        System.out.print("Введите номер строки: ");
        int k = num.nextInt();
        System.out.print("Введите номер столбца: ");
        int p = num.nextInt();

        int[][] array = new int[10][10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("строка под номером" + k);
        for (int i = 0; i < 1; i++) {                       //нахождение строки
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[k][j] + " ");
            }
        }
        System.out.println();
        System.out.println("столбец под номером:" + p);       //нахождение столбца
        for (int i = 0; i < array.length; i++) {
            for (int j = p; j < p + 1; j++) {
                System.out.print(array[i][p] + " ");
            }
        }
    }
}
