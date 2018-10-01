package listy_iterators;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ListIteratorImpl<T> implements Iterable<T>, ListIterator {
    private int index;
    private List<T> data;

    public ListIteratorImpl(T... items) {
        this.index = 0;
        this.data = Arrays.asList(items);
    }

    @Override
    public Iterator<T> iterator() {
        return new IteratotListInner();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        while (this.iterator().hasNext()) {
            action.accept(this.iterator().next());
        }
    }

    @Override
    public boolean move() {
        if (this.iterator().hasNext()) {
            this.iterator().next();
            return true;
        }
        return false;
    }

    @Override
    public boolean hasNext() {
        return this.iterator().hasNext();
    }

    @Override
    public void print() {
        if (index < data.size()) {
            System.out.println(data.get(index));
        }throw new UnsupportedOperationException("Invalid Operation!");

    }

    public final class IteratotListInner implements Iterator<T> {

        @Override
        public boolean hasNext() {
            return index < data.size() - 1;
        }

        @Override
        public T next() {
            return data.get(index++);
        }
    }
}
