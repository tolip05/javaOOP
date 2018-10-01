package border_control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Identifiable> residents = new ArrayList<>();
        List<BirthDay>residentsWithBirthDay = new ArrayList<>();
        String line;
        while (true) {

            if ("end".equalsIgnoreCase(line = br.readLine())) {
                break;
            }
            String[] tokens = line.split(" ");
            Identifiable resident = null;
            BirthDay residentWithBirth = null;
            if (tokens[0].equalsIgnoreCase("citizen")) {

                resident = new Citizen(tokens[1]
                        , Integer.parseInt(tokens[2]), tokens[3],tokens[4]);
                residentWithBirth = new Citizen(tokens[1]
                        , Integer.parseInt(tokens[2]), tokens[3],tokens[4]);
            }
            else if(tokens[0].equalsIgnoreCase("robot")){
                resident = new Robot(tokens[0], tokens[1],tokens[2]);
                residentWithBirth = new Robot(tokens[0], tokens[1],tokens[2]);
            }
            else {
                residentWithBirth = new Pet(tokens[1],tokens[2]);
            }

            residents.add(resident);
            if (residentWithBirth != null){

            residentsWithBirthDay.add(residentWithBirth);
            }
        }
        String yar = br.readLine();
//        residents.stream()
//                .filter(r -> r.getId().endsWith(lastDigitOfId))
//                .forEach(r -> System.out.println(r.getId()));
        residentsWithBirthDay.stream().filter(d -> d.getBirthDay().endsWith(yar))
                .forEach(d -> System.out.println(d.getBirthDay()));
    }
}
