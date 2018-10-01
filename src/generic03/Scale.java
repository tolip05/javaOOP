package generic03;

public class Scale <T extends Comparable <T>> {
    private T e1;
    private T e2;

    public Scale(T e1, T e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public T GetHeavier() {
        if (e1.compareTo(e2) > 0) {
            return e1;
        } else if (e1.compareTo(e2) < 0) {
            return e2;
        } else {
            return null;
        }
    }
}
