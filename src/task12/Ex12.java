package task12;

import generators.CountingGenerator;

import java.util.Arrays;

public class Ex12 {
    public static void start(){
        double[] doubles = new double[5];
        CountingGenerator.Double aDouble = new CountingGenerator.Double();
        for(int i = 0; i < doubles.length; i++){
            doubles[i] = aDouble.next();
        }

        System.out.println(Arrays.toString(doubles));
    }


}
