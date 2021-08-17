package task4;

public class ThreeDimensionalArray {
    public static Double[][][] getDoubleTwoDimensionalArray(int n, int m, int z, int b1, int b2) {
        Double[][][] array = new Double[n][m][z];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int g = 0; g < z; g++){
                    array[i][j][g] = (Math.random() * (b2 - b1)) + b1;
                }

            }
        }

        return array;

    }

    public static <T> void printThreeDimensionalArray(T[][][] t) {
        for (int i = 0 ; i  < t.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < t[0].length; j++) {
                System.out.print("[ ");
                for (int g = 0; g < t[0][0].length; g++){
                    System.out.print(t[i][j][g] + " ");
                }
                System.out.print("]");
            }
            System.out.println("]");
        }
    }
}
