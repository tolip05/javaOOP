package generic;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Generic<Integer>ars = new Generic<>(new ArrayDeque<>());
        ars.add(1);
        ars.add(2);
        ars.add(3);
        ars.remove();
        for (Integer s :ars.getElements()) {
            System.out.println(s);
        }

    }
}
