package Task16;

import java.util.Arrays;
import java.util.Random;

public class Array16 {
    public static void main(String[] args) {
        //Магическим квадратом порядка n называется квадратная матрица размера nxn,
        // составленная из чисел 1, 2, 3, ...,
        // так, что сумма по каждому столбцу, каждой строке и каждой из двух
        // больших диагоналей равны между собой. Построить такой квадрат.
        int n = 4;
        int array[][] = new int[n][n];
        int sum = (int) ((n * (Math.pow(n, 2) + 1)) / 2); // условие для стобца строки и диогонали !!!!
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        System.out.println("Исходный масссив:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));                     // исходный массив
        }
        System.out.println("Сумаа каждого столбца:");

        int arrayColumn[] = new int[n];                                     // массив с значением суммы в столбцах

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayColumn[i] += array[j][i];
            }
        }
        System.out.print(Arrays.toString(arrayColumn));                     // вывод массива с суммой в столбцах

        System.out.println();
        System.out.println("Сумма каждой строки");
        int arrayLine[] = new int[n];                                       // массив с значением суммы в строках

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayLine[i] += array[i][j];
            }

        }
        System.out.print(Arrays.toString(arrayLine));                       // вывод массива с суммой в строках
        System.out.println();

        int diagonalSum1 = 0;

        for (int i = 0; i < array.length; i++) {                            //сумма главной диогонали
            diagonalSum1 = diagonalSum1 + array[i][i];

        }
        System.out.println("Сумма главной диогонали:" + diagonalSum1);

        int diagonalSum2 = 0;                                               // сумма побочной диогонали

        for (int i = 0; i < array.length; i++) {
            diagonalSum2 = diagonalSum2 + array[i][array.length - 1 - i];

        }
        System.out.println("Сумма побочной диогонали:" + diagonalSum2);         //вывод побочной диогонали
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (arrayColumn[i] == sum || arrayLine[i] == sum || diagonalSum1 == sum || diagonalSum2 == sum) {
                System.out.println("Данная матрица магическая");
            } else {
                System.out.println("Данная матрица не магическая");
            }
        }
    }
}
