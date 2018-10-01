package generic01;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Jar<String>stringJar = new Jar<>(new ArrayDeque<>());
        stringJar.add("Cucumber1");
        stringJar.add("Cucumber2");
        stringJar.add("Cucumber3");
        stringJar.remove();
        for (String s : stringJar.getElements()) {
            System.out.println(s);
        }
    }
}
