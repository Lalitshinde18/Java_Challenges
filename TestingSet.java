package Collection_Framework;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("lalit"));
        System.out.println(names.add("Rohan"));
        System.out.println(names.add("Gaurav"));
        System.out.println(names.add("Ram"));

        System.out.println(names);
//        System.out.println(names.add("lalit"));
        System.out.println(names.contains("lalit"));

    }
}
