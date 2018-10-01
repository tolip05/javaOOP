package birthDay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<BurthDay> days = new ArrayList<>();

        String line;
        while (true) {
            if ("end".equalsIgnoreCase(line = br.readLine())) {
                break;
            }
            String[] tokens = line.split(" ");
            BurthDay day = null;
            if (tokens.length == 3) {
                day = new First(tokens[0], tokens[1], tokens[2]);
            } else {
                day = new Second(tokens[0], tokens[1], tokens[2]
                        , tokens[3], tokens[4]);
            }
            days.add(day);
        }
        String fal = br.readLine();

        days.stream().filter(d -> d.getBirthDay().endsWith(fal))
                .forEach(d -> System.out.println(d.getBirthDay()));

    }
}
