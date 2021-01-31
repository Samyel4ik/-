package Task5;

import java.util.Arrays;

public class Array5 {
    public static void main(String[] args) {
        int n = 5;
        int array[][] = new int[n][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j >= n - i) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = i + 1;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
