package Collection_Framework;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    public static void main(String[] args) {

        Queue<Integer>  Queue = new LinkedList<>() ;

        Queue.add(1);
        Queue.add(2);
        Queue.add(3);
        Queue.add(4);
        System.out.println(Queue);


    }
}
