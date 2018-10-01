package generic04;

import sun.font.FontRunIterator;

import java.util.ArrayList;
import java.util.List;

public class ListUtils{
    public <T extends Comparable<T>> T getMin(List<T> list) {

        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        T firstElement = list.get(0);
        for (int i = 1; i < list.size(); i++) {

            if (firstElement.compareTo(list.get(i)) > 0 ){
                firstElement = list.get(i);
            }
        }
        return firstElement;
    }


    public <T extends Comparable<T>> T getMax(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        T firstElement = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (firstElement.compareTo(list.get(i)) < 0){
                firstElement = list.get(i);
            }
        }
        return firstElement;
    }

    public static List<Integer>getNullIndecies(List<?> list){
        List<Integer>result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null){
                result.add(i);
            }
        }
        return result;
    }
    public static <T>void flatten(List<? super T>dest,List<List<? extends T>> source){
        for (List<? extends T> ts : source) {
            dest.addAll(ts);
        }
    }
    

}
