package genericCustomList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        CustomList<String> list = new CustomList<>();

        while (true) {
            String[] tokens = br.readLine().split(" ");
            if ("end".equalsIgnoreCase(tokens[0])) {
                break;
            }
            switch (tokens[0]) {
                case "Add":
                    list.addElement(tokens[1]);
                    break;
                case "Remove":
                    list.remove(Integer.parseInt(tokens[1]));
                    break;
                case "Contains":
                    System.out.println(list.contains(tokens[1]));
                    break;
                case "Swap":
                    list.swap(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                    break;
                case "Greater":
                    System.out.println(list.countGreaderThan(tokens[1]));
                    break;
                case "Max":
                    System.out.println(list.getMax());
                    break;
                case "Min":
                    System.out.println(list.getMin());
                    break;
                case "Print":
                    for (String s : list.getMyList()) {
                        System.out.println(s);
                    }
                case "Sort":
                    Sorted.sort(list);
                    break;
            default:
                break;
            }
        }
    }
}

