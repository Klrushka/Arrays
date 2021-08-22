package task18;

import task1.BerylliumSphere;

import java.util.Arrays;

public class CopiedArray {
    private static BerylliumSphere[] berylliumSphere1 = new BerylliumSphere[5];

    private static BerylliumSphere[] berylliumSphere2 = new BerylliumSphere[5];

    public static void test(){

        for (int i = 0; i < berylliumSphere1.length; i++)
            berylliumSphere1[i] = new BerylliumSphere();


        System.out.println("array 1 = " + Arrays.toString(berylliumSphere1));
        System.out.println("array 2 = " + Arrays.toString(berylliumSphere2));

        System.arraycopy(berylliumSphere1,0,berylliumSphere2,0,berylliumSphere1.length);

        System.out.println("array 1 = " + Arrays.toString(berylliumSphere1));
        System.out.println("array 2 = " + Arrays.toString(berylliumSphere2));


    }


}
