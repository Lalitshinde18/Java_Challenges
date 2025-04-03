package MultiThreading;

public class NeedOfMultiThreading {
    public static void main(String[] args) {
    /*    // First Task
        for(int i=1; i<=1000; i++){
            System.out.printf("%d*",i);

        }
        System.out.println("\n task Complete");

        // Second Task
        for(int i=1; i<=1000; i++){
            System.out.printf("%d#",i);
        }
        System.out.println("\n task Complete");

        // Third Task
        for(int i=1; i<=1000; i++){
            System.out.printf("%d$",i);
        }
        System.out.println("\n task Complete");

     */
        long startTime = System.currentTimeMillis();
        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();

        t1.start();
        t2.start();
        t3.start();


        long endTime = System.currentTimeMillis();
        System.out.printf("Total Time taken: %d",
                Thread.currentThread().getName(),
                (endTime - startTime));
    }
}
