package Task4;

import java.util.Arrays;

public class Array4 {
    public static void main(String[] args) {
        int n = 5;
        int[][] array = new int[n][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0) {
                    array[i][j] = j + 1;
                }
                if (i % 2 != 0) {
                    array[i][j] = n - j;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
