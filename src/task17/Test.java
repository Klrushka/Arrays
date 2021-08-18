package task17;

import generators.BDGenerator;
import generators.Generated;

import java.math.BigDecimal;
import java.util.Arrays;

public class Test {
    public static void test(){
        BigDecimal[] bigDecimals = new BigDecimal[5];

        System.out.println(Arrays.toString(Generated.array(bigDecimals, new BDGenerator())));

    }
}
