package Task8;

import java.util.Arrays;
import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        //В числовой матрице поменять местами два столбца любых столбца,
        // т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
        // а его элементы второго переместить в первый.
        // Номера столбцов вводит пользователь с клавиатуры.

        int array[][] = new int[5][5];

        Scanner num = new Scanner(System.in);
        System.out.print("Введите значение первого стобца: ");
        int x = num.nextInt();
        System.out.print("Введите значение второго стобца: ");
        int y = num.nextInt();

        for (int i = 0; i < array.length; i++) {            // заполнение
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = j + 1;
            }
        }
        System.out.println();
        System.out.println("Первоночальный массив");
        for (int i = 0; i < array.length; i++) {            // вывод первоночального .
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("Измененный массив по заданным столбцам");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int a = array[i][x];
                array[i][x] = array[i][y];
                array[i][y] = a;
            }
        }
        for (int i = 0; i < array.length; i++) {            //вывод измененного массива по столбцам
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
