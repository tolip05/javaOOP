package listy_Iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        ListIteratorImpl<String> someList = null;
        while (!"end".equalsIgnoreCase(line = br.readLine())) {
            String[] commands = line.split(" ");
            switch (commands[0]) {
                case "Create":
                    String[] elements = Arrays.stream(commands).skip(1L).toArray(String[]::new);
                    someList = new ListIteratorImpl<>(elements);
                    break;
                case "Move":
                    System.out.println(someList.move());
                    break;
                case "HasNext":
                    System.out.println(someList.hasNext());
                    break;
                case "Print":
                    try {
                        someList.print();
                    } catch (UnsupportedOperationException ue) {
                        System.out.println(ue.getMessage());
                    }
                    break;

            }

        }
    }
}
