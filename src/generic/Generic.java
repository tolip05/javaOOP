package generic;


import java.util.Deque;

public class Generic<T> {
    private Deque<T> elements;

    public Generic(Deque<T> elements) {
        this.elements = elements;
    }

    public Generic() {

    }

    public Deque<T> getElements() {
        return this.elements;
    }

    void add(T element){
        this.elements.addFirst(element);
    }
    void remove(){
        this.elements.removeFirst();
    }

}
