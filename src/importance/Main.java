package importance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String level = br.readLine();
        Logger logger = new Logger(Importance.valueOf(level));

        String command = br.readLine();
        while (!"end".equalsIgnoreCase(command)){
            int colonIndex = command.indexOf(":");
            String massageLevel = command.substring(0,colonIndex);
            String content = command.substring(colonIndex + 2);

            logger.record(new Message(Importance.valueOf(massageLevel),content));

            command = br.readLine();
        }

        for (Message message : logger.getMessages()) {
            System.out.println(message);
        }

//        Logger logger = new Logger(Importance.HIGH);
//        logger.record(new Message(Importance.LOW,"low level"));
//        logger.record(new Message(Importance.HIGH,"high level"));
//        logger.record(new Message(Importance.MEDIUM,"medium level"));
//        logger.record(new Message(Importance.HIGH,"lowhigh level"));


    }
}
