package task18;

import task1.BerylliumSphere;

import java.util.Arrays;

public class CopiedArray {
    private static BerylliumSphere[] berylliumSphere1 = new BerylliumSphere[]{new BerylliumSphere(),
            new BerylliumSphere(), new BerylliumSphere()};

    private static BerylliumSphere[] berylliumSphere2 = new BerylliumSphere[3];

    public static void test(){
        System.arraycopy(berylliumSphere1,0,berylliumSphere2,0,3);

        System.out.println("array 1 = " + Arrays.toString(berylliumSphere1));
        System.out.println("array 2 = " + Arrays.toString(berylliumSphere2));

    }


}
