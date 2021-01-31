package Task7;


import java.util.Arrays;

public class Array7 {
    public static void main(String[] args) {
        //Сформировать квадратную матрицу порядка N по правилу:
        int n = 5;
        double array[][] = new double[n][n];
        int a = 2; //степень
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Math.sin(((Math.pow(i, a)) - (Math.pow(j, a))) / n);
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

    }
}
