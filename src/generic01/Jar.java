package generic01;

import java.util.Deque;
import java.util.Stack;

public class Jar<T> {
    private Deque<T> elements;

    Jar(Deque<T> elements) {
        this.elements = elements;
    }

    public Deque<T> getElements() {
        return this.elements;
    }

    void add(T element){
        elements.addFirst(element);
    }

    void remove(){
        elements.removeFirst();
    }
}
