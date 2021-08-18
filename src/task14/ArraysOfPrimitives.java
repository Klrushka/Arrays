package task14;


import generators.CountingGenerator;
import generators.Generator;

import java.util.Arrays;

public class ArraysOfPrimitives {

    private static int[] ints = new int[5];
    private static char[] chars = new char[5];
    private static double[] doubles = new double[5];
    private static float[] floats = new float[5];
    private static long[] longs = new long[5];
    private static boolean[] booleans = new boolean[5];
    private static short[] shorts = new short[5];
    private static byte[] bytes = new byte[5];


    private static void fillArrays() {
        for (int i = 0; i < 5; i++) {
            ints[i] = (int) next(new CountingGenerator.Integer());
            chars[i] = (char) next(new CountingGenerator.Character());
            doubles[i] = (double) next(new CountingGenerator.Double());
            floats[i] = (float) next(new CountingGenerator.Float());
            longs[i] = (long) next(new CountingGenerator.Long());
            booleans[i] = (boolean) next(new CountingGenerator.Boolean());
            shorts[i] = (short) next(new CountingGenerator.Short());
            bytes[i] = (byte) next(new CountingGenerator.Byte());
        }
    }


    public static void printArrays(){
        System.out.println("ints: " + Arrays.toString(ints) + '\n' +
                "chars: " + Arrays.toString(chars) + '\n' +
                "doubles: " + Arrays.toString(doubles) + '\n' +
                "floats: " + Arrays.toString(floats) + '\n' +
                "longs: " + Arrays.toString(longs) + '\n' +
                "booleans: " + Arrays.toString(booleans) + '\n' +
                "shorts: " + Arrays.toString(shorts) + '\n' +
                "byted: " + Arrays.toString(bytes));
    }



    private static Object next(Generator<?> generator) {
        return generator.next();
    }
}
