package Task6;

import java.util.Arrays;

public class Array6 {
    public static void main(String[] args) {
        int n = 5;
        int array[][] = new int[7][7];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j >= i && j < array.length - i) {
                    array[i][j] = 1;
                }
                if (j - 1 < i && j >= array.length - i - 1) {
                    array[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
