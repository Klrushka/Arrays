package task23;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class ReversedIntegers {
    private static Integer[] integer;

    public static void start(int size){
        integer = new Integer[size];

        for (int i = 0; i < size; i++){
            integer[i] = new Random().nextInt(100);
        }


        System.out.println(Arrays.toString(integer));

        Arrays.sort(integer, Comparator.reverseOrder());

        System.out.println(Arrays.toString(integer));

    }
}
