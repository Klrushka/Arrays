package task19;

import java.util.Arrays;

public class EqualsArrays {
    private int anInt;

    public EqualsArrays(int i) {
        anInt = i;
    }


    public static void test(EqualsArrays[] equalsArrays1, EqualsArrays[] equalsArrays2) {
        System.out.println(Arrays.equals(equalsArrays1, equalsArrays2));
    }

    @Override
    public boolean equals(Object obj) {
        return obj.getClass().getSimpleName().equals("EqualsArrays") && this.anInt == ((EqualsArrays) obj).anInt;
    }


}
