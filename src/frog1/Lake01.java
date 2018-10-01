package frog1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lake01<T extends Integer> implements Iterable<T>{
    private List<Integer>steps;

    public Lake01(Integer... steps) {
        this.steps = Arrays.asList(steps);
    }

    @Override
    public Iterator<T> iterator() {
        return (Iterator<T>) new Frog();
    }

    private final class Frog implements Iterator<Integer>{
        private int index;
        private List<Integer>indexes;

        public Frog() {
            this.index = 0;
            this.setIndexes();
        }

        private void setIndexes() {
            this.indexes = new ArrayList<>();
            for (int i = 0; i < steps.size(); i += 2) {
                this.indexes.add(i);
            }
            for (int i = 1; i < steps.size(); i += 2) {
                this.indexes.add(i);
            }
        }


        @Override
        public boolean hasNext() {
            return this.index < steps.size()-1;
        }

        @Override
        public Integer next() {
            return steps.get(this.indexes.get(this.index ++));
        }
    }

}
