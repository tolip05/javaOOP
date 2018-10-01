package newList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        ListyIterator listy = null;
        while (!"end".equalsIgnoreCase(line = br.readLine())) {
            String[] tokens = line.split(" ");
            switch (tokens[0]) {
                case "Create":
             listy = new ListyIterator(Arrays.stream(tokens).skip(1L).toArray(String[]::new));
             break;
                case "Move":
                    System.out.println(listy.move());
                    break;
                case "HasNext":
                    System.out.println(listy.HasNext());
                    break;
                case "Print":
                    try{
                        listy.print();
                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
            }
        }
    }
}
