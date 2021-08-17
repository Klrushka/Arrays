package task13;

import generators.CountingGenerator;
import generators.RandomGenerator;

public class Ex13 {
    public static void start(){
        String s = "";
        CountingGenerator.Character countingGenerator = new CountingGenerator.Character();

        for (int i = 0; i < 10; i++){
            s += countingGenerator.next();
        }

        System.out.println(s);
    }
}
