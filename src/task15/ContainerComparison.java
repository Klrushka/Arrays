package task15;

import generators.BSGenerator;
import generators.Generated;
import task1.BerylliumSphere;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContainerComparison {
    public static void start() {
        BerylliumSphere[] spheres = new BerylliumSphere[10];
        BSGenerator generator = new BSGenerator();
        Generated.array(spheres, generator);
        System.out.println(Arrays.toString(spheres));
        System.out.println(spheres[4]);
        List<BerylliumSphere> sphereList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            sphereList.add(generator.next());
        }
        System.out.println(sphereList);
        System.out.println(sphereList.get(4));

    }
}
