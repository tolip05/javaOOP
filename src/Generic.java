import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
        List st = new ArrayList();
        st.add("1");
        st.add("2");
        st.add("3");
        st.add(5);
        String a = (String)st.get(0);
        int b = (Integer)st.get(3);
        System.out.println(a);
        System.out.println(b);

    }
}
