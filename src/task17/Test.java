package task17;

import generators.Generated;
import task16.SkipGenerator;

import java.math.BigDecimal;
import java.util.Arrays;

public class Test {
    public static void test(){
        BigDecimal[] bigDecimals = new BigDecimal[5];

        System.out.println(Arrays.toString(Generated.array(bigDecimals, new SkipGenerator.BigDecimal1(new BigDecimal(123456789)).getGenerator())));
    }
}
