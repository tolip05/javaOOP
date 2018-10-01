package newList;

import java.util.Arrays;
import java.util.List;

public class ListyIterator {
    private static final String FINAL = "Invalid Operation!";

    private int index;

    private List<String> collections;

    public ListyIterator(String... element) {
        this.collections = Arrays.asList(element);
        this.index = 0;
    }


    public boolean move() {
        if (this.collections.size() - 1 == this.index) {
            return false;
        }
        this.index++;
        return true;
    }
    public boolean HasNext(){
        return this.collections.size() - 1 != this.index;
    }
    public void print(){
        if (this.collections.size() == 0){
            throw new IllegalArgumentException(FINAL);
        }else{
            System.out.println(this.collections.get(this.index));
        }
    }
}

