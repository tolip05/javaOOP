package aaaaaa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int b =0;
         First[] f = First.values();
        for (First first : f) {
            b += first.getValue();
            if (first.name().equalsIgnoreCase(a)){
            //System.out.println(String.format("%d %s",first.ordinal(),first.name()));
                System.out.println(String.format("Card name: %s of CLUBS; Card power: %d",first.name(),b));
                break;
            }
        }
    }
}
