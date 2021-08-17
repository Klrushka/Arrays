package task7;

import task1.BerylliumSphere;

public class ThreeDimensionalArrayBS {
    public static BerylliumSphere[][][] getDoubleTwoDimensionalArray(int n, int m, int z) {
        BerylliumSphere[][][] array = new BerylliumSphere[n][m][z];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int g = 0; g < z; g++){
                    array[i][j][g] = new BerylliumSphere();
                }

            }
        }

        return array;

    }
}
