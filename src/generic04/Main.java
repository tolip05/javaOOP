package generic04;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9);
        ListUtils la = new ListUtils();
        System.out.println(la.getMax(list));
        System.out.println(la.getMin(list));
        List<String>strings = new ArrayList<>();
        Collections.addAll(strings,null,"min","los","kil",null,"pol",null);
        System.out.println(ListUtils.getNullIndecies(strings));
    }
}
