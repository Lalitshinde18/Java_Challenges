import java.util.*;
import java.util.Collection;
public class sorting {
    public static void main(String[] args) {
        
        ArrayList<Integer> number =new ArrayList<Integer>();

        number.add(10);
        number.add(1);
        number.add(20);
        number.add(50);
        number.add(10);
        number.add(110);
        number.add(17);

        Collections.sort(number);

        for(Integer i :number){
            System.out.println(i);
        }
    }
}
