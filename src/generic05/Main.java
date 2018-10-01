package generic05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[]line1 = br.readLine().split(" ");
        Tuple<String,String> l1 = new Tuple<>(line1[0] + " " + line1[1],line1[2]);
        String[] line2 = br.readLine().split(" ");
        Tuple<String,Integer>l2 = new Tuple<>(line2[0],Integer.valueOf(line2[1]));
        String[]line3 = br.readLine().split(" ");
        Tuple<Integer,Double>l3 = new Tuple<>
                (Integer.valueOf(line3[0]),Double.valueOf(line3[1]));
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }
}
