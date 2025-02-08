package Collection_Framework.Challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
Use the collections class to count the frequency of a particular
element in an array
 */

public class Frequency {
    public static void main(String[] args) {
        List<Integer> list  =  Arrays.asList(1,2,4,5,6,7,8);
        System.out.println(Collections.frequency(list,1));
        System.out.println(Collections.frequency(list,2));
        System.out.println(Collections.frequency(list,4));
    }
}
