package generators;

import task1.BerylliumSphere;

public class BSGenerator implements Generator<BerylliumSphere> {
    @Override
    public BerylliumSphere next() {
        return new BerylliumSphere();
    }
}
