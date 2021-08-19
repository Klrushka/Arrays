package task21;

public class CBerylliumSphere implements Comparable<CBerylliumSphere>{
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
}
