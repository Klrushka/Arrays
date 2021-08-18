package generators;

public interface SGenerator<T> extends Generator<T> {
    T next(int n);

}
