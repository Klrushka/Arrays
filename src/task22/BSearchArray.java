package task22;

import java.util.Arrays;
import java.util.Random;

public class BSearchArray {
    public static void start() {
        int[] ints = new int[10];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = new Random().nextInt(10);
        }

        System.out.println(Arrays.toString(ints));

        for (int i = 0; i < 10; i++) {
            System.out.println(ints[i] + " searching... " +
                    "result: " + Arrays.binarySearch(ints,ints[i]));
        }



    }
}
