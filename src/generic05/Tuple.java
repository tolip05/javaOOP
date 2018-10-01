package generic05;

public class Tuple<T,E> {
    private T el1;
    private E el2;

    public Tuple(T el1, E el2) {
        this.el1 = el1;
        this.el2 = el2;
    }

    @Override
    public String toString() {
        return this.el1 + " -> " + this.el2;
    }
}
