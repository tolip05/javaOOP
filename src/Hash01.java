

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Hash01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        String[] tokens = br.readLine().split(" ");

        for (int i = 0; i < tokens.length; i++) {
            String text = tokens[i];
            Integer count = map.get(text);
            if (count == null) {
                count = 0;
            }
            map.put(text, count + 1);
        }
        for (Map.Entry<String, Integer> str : map.entrySet()) {
            System.out.printf("%s %d%n",str.getKey(),str.getValue());
        }
    }
}
