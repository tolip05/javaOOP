package generic06;

public class Box<T> {
    private T el;

    public Box(T el) {
        this.el = el;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + this.el;
    }
}
