package task6;

import task1.BerylliumSphere;

public class TwoDimensionalArrayBS {
    public static BerylliumSphere[][] getTwoDimensionalArrayBS(int n, int m) {
        BerylliumSphere[][] berylliumSphere = new BerylliumSphere[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                berylliumSphere[i][j] = new BerylliumSphere();
            }
        }
        return berylliumSphere;
    }
}
