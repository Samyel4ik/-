package Task14;

import java.util.Arrays;

public class Array14 {
    public static void main(String[] args) {
        //Сформировать случайную матрицу mxn, состоящую из нулей и единиц,
        // причем в каждом столбце число единиц равно номеру столбца.
        int array [][]= new int[5][5];

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                if (i<=j){                                   //если убрать равно , то счет с нуля а не с еденицы
                    array[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

    }
}
