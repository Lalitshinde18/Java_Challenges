package MultiThreading;

public class FirstTask extends Thread{
    @Override
    public void run() {
        // First Task
        for(int i=1; i<=1000; i++){
            System.out.printf("%d*",i);

        }
        System.out.println("\n  first task Complete");

    }
}
