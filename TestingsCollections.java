package Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestingsCollections {

    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();

        num.add(23);
        num.add(2);
        num.add(33);
        num.add(-76);
     System.out.println(num);
      //  Collections.sort(num);
        Collections.reverse(num);
        System.out.println(num);

        List<Integer> Unmodifiable = Collections.unmodifiableList(num);



    }
}
