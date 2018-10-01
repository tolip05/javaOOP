import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Hash02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        String[] tokens = br.readLine().split(" ");
        for (int i = 0; i < tokens.length; i++) {
            String str = tokens[i];
            if (!map.containsKey(str))
            {
                map.put(str, 1);
            }else {
                int a = map.get(str);
                map.put(str,a += 1);
            }
        }
        for (Map.Entry<String,Integer> sop : map.entrySet()) {
            System.out.printf("%s %d%n",sop.getKey(),sop.getValue());
        }
    }
}

