package truple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] l1 = br.readLine().split(" ");
        Truple<String,String,String>tr1 = new Truple<>(l1[0] + " " + l1[1],
                l1[2],l1[3]);
        String[]l2 = br.readLine().split(" ");
        boolean isTrue = true;
        if (l2[2].equalsIgnoreCase("not")){
            isTrue = false;
        }
        Truple<String,Integer,Boolean>tr2 = new Truple<>(l2[0],Integer.valueOf(l2[1]),isTrue);
        String[]l3 = br.readLine().split(" ");
        Truple<String,Double,String>tr3 = new Truple<>(l3[0]
                ,Double.parseDouble(l3[1]),l3[2]);

        System.out.println(tr1);
        System.out.println(tr2);
        System.out.println(tr3);


    }
}
