package listy_iterators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        ListIteratorImpl<String> someList = null;
        while (!"end".equalsIgnoreCase(line = br.readLine())){
            String[]commands = line.split("\\s+");
            switch (commands[0]){
                case "Create":
                    String[] some = Arrays.stream(commands).skip(1L).toArray(String[]::new);
                    someList = new ListIteratorImpl<>(some);
                    break;
                case "Move":
                    System.out.println(someList.move());
                    break;
                case "HasNext":
                    System.out.println(someList.hasNext());
                    break;
                case "Print":
                    try{
                        someList.print();
                    }catch (UnsupportedOperationException e){
                        System.out.println(e.getMessage());
                    }
                    break;
            }

        }
    }
}
