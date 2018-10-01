package coffee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        CoffeeMachine cm = new CoffeeMachine();
        while (true){
            String[]line = br.readLine().split(" ");
            if ("end".equalsIgnoreCase(line[0])){
                break;
            }else if (line.length == 1){
                cm.insertCoin(line[0]);
            }else{
                cm.byCoffee(line[0],line[1]);
            }
        }
        for (Coffee coffee : cm.getCoffeeSold()) {
            System.out.println(coffee);
        }
    }
}
