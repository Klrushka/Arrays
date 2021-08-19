package task21;

import java.util.Comparator;

public class CBerylliumSphereComparator implements Comparator<CBerylliumSphere> {
    @Override
    public int compare(CBerylliumSphere o1, CBerylliumSphere o2) {
        return (Long.compare(o2.getId(), o1.getId()));
    }
}
