package task3;

public class TwoDimensionalArray {
    public static Double[][] getDoubleTwoDimensionalArray(int n, int m, int b1, int b2) {
        Double[][] array = new Double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = (Math.random() * (b2 - b1)) + b1;
            }
        }

        return array;

    }

    public static <T> void printTwoDimensionalArray(T[][] t) {
        for (T[] ts : t) {
            System.out.print("[ ");
            for (int j = 0; j < t[0].length; j++) {
                System.out.print(ts[j] + " ");
            }
            System.out.println("]");
        }
    }
}
