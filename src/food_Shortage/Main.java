package food_Shortage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Bayer> residents = new HashMap<>();
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            String[] tokens = br.readLine().split(" ");

            if (residents.containsKey(tokens[0])){
                continue;
            }
            Bayer bayer = null;
            if (tokens.length == 4) {
                bayer = new Citizen(tokens[0], Integer.parseInt(tokens[1])
                        , tokens[2], tokens[3]);
            }else{
                bayer = new Rebel(tokens[0],Integer.parseInt(tokens[1]),tokens[2]);
            }
            residents.putIfAbsent(tokens[0],bayer);
        }
        String name;
        while (true){
            if ("end".equalsIgnoreCase(name = br.readLine())){
                break;
            }
            if (residents.containsKey(name)){
                residents.get(name).byFood();
            }

        }
        System.out.println(residents.values().stream().mapToInt(Bayer::getFood)
        .sum());
    }
}
