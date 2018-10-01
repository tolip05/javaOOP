package genericCustomList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class CustomList<T extends Comparable> implements Iterable<T>{
    List<T> myList;

    CustomList() {
        this.myList = new ArrayList<>();
    }
    public T getElement(int index){
        return myList.get(index);
    }

    public int getSize(){
       return myList.size();
    }

    List<T> getMyList() {
        return this.myList;
    }

    void addElement(T element) {
        myList.add(element);
    }

    T remove(int index) {
        return myList.remove(index);
    }

    boolean contains(T element) {
        return myList.contains(element);
    }

    void swap(int index1, int index2) {
        T element = myList.get(index1);
        myList.set(index1, myList.get(index2));
        myList.set(index2, element);
    }

    int countGreaderThan(T element) {
        int counter = -1;
        for (T t : myList) {
            if (element.compareTo(t) > 0) ;
            counter++;
        }
        return counter;
    }

    T getMax() {
        T element = myList.get(0);
        for (int i = 1; i < myList.size(); i++) {
            if(element.compareTo(myList.get(i)) < 0){
                element = myList.get(i);
            }
        }
        return element;
//        for (T t : myList) {
//            if (element.compareTo(t) > 0) ;
//            element = t;
//        }
//        return element;
    }

    T getMin() {
        T element = myList.get(0);
        for (int i = 1; i < myList.size(); i++) {
            if (element.compareTo(myList.get(i)) > 0){
                element = myList.get(i);
            }
        }
        return element;
//        for (T t : myList) {
//            if (element.compareTo(t) < 0) ;
//            element = t;
//        }
//        return element;
    }

    @Override
    public Iterator<T> iterator() {
        return this.myList.iterator();
    }
}
