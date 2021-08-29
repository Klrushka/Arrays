package task16;

import generators.ConvertTo;
import generators.Generated;

import java.util.Arrays;

public class TestArrayGeneration {
    public static void start() {
        int size = 6;
        int n = 5;
        boolean[] a1 = ConvertTo.primitive(Generated.array(
                Boolean.class, new SkipGenerator.Boolean(n).getGenerator(), size));
        System.out.println("a1 = " + Arrays.toString(a1));


        byte[] a2 = ConvertTo.primitive(Generated.array(
                Byte.class, new SkipGenerator.Byte(n).getGenerator(), size));
        System.out.println("a2 = " + Arrays.toString(a2));



        short[] a4 = ConvertTo.primitive(Generated.array(
                Short.class, new SkipGenerator.Short(n).getGenerator(), size));
        System.out.println("a4 = " + Arrays.toString(a4));


        int[] a5 = ConvertTo.primitive(Generated.array(
                Integer.class, new SkipGenerator.Integer(n).getGenerator(), size));
        System.out.println("a5 = " + Arrays.toString(a5));


        long[] a6 = ConvertTo.primitive(Generated.array(
                Long.class, new SkipGenerator.Long(n).getGenerator(), size));
        System.out.println("a6 = " + Arrays.toString(a6));


        float[] a7 = ConvertTo.primitive(Generated.array(
                Float.class, new SkipGenerator.Float(n).getGenerator(), size));
        System.out.println("a7 = " + Arrays.toString(a7));


        double[] a8 = ConvertTo.primitive(Generated.array(
                Double.class, new SkipGenerator.Double(n).getGenerator(), size));
        System.out.println("a8 = " + Arrays.toString(a8));
    }
}
