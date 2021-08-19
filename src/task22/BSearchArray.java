package task22;

import java.util.Arrays;

public class BSearchArray {
    public static void start(){
        int[] ints = new int[]{135, 5, 965, 25, 10, -45, 75, 15};

        System.out.println(Arrays.toString(ints));

        System.out.println("75 position: " + Arrays.binarySearch(ints,75));
        System.out.println("-45 position: " + Arrays.binarySearch(ints,-45));
        System.out.println("5 position: " + Arrays.binarySearch(ints,5));
    }
}
