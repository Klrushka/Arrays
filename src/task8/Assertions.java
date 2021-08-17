package task8;

public class Assertions<T> {
    static Object[] objects = new Object[5];
    @SuppressWarnings("unchked")
    T[] ts = (T[]) objects;

    public static void test() {
        String[] strings = new String[5];
        strings[0] = "";
       //strings[1] = new Integer(5);
        objects[2] = 5;
    }


}
