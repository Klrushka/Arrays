package task2;

import task1.BerylliumSphere;

public class ReturnArrayOfBS {
    public static BerylliumSphere[] getArray(int n) {
        BerylliumSphere[] spheres = new BerylliumSphere[n];

        for (int i = 0; i < n; i++) {
            spheres[i] = new BerylliumSphere();
        }

        return spheres;
    }
}
