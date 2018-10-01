package truple;

public class Truple <T,E,B> {
    private T el1;
    private E el2;
    private B el3;

    public Truple(T el1, E el2, B el3) {
        this.el1 = el1;
        this.el2 = el2;
        this.el3 = el3;
    }

    @Override
    public String toString() {
        return this.el1 + " -> " + this.el2 + " -> " + this.el3;
    }
}
