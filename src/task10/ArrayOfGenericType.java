package task10;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfGenericType<T> {
    List<T> array;
    public ArrayOfGenericType() {
        array = new ArrayList<>();
    }
    public <U> List<U> makeArray() { return new ArrayList<>(); }
}
