package task21;


import java.util.Comparator;

public class CBerylliumSphere implements Comparable<CBerylliumSphere> {
    private static long counter;
    private final long id = counter++;

    public int compareTo(CBerylliumSphere c2) {
        return (Long.compare(this.id, c2.id));
    }

    public String toString() {
        return "Sphere " + id;
    }

    public long getId() {
        return id;
    }

    public static class CBerylliumSphereComparator implements Comparator<CBerylliumSphere> {
        @Override
        public int compare(CBerylliumSphere o1, CBerylliumSphere o2) {
            return (Long.compare(o2.getId(), o1.getId()));
        }
    }
}
