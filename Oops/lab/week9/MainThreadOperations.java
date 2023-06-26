package Oops.lab.week9;

public class MainThreadOperations {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();

        System.out.println("Current Thread: " + mainThread);
        System.out.println("Thread Name: " + mainThread.getName());
        mainThread.setName("MyMainThread");
        System.out.println("Thread Priority: " + mainThread.getPriority());
        mainThread.setPriority(Thread.MAX_PRIORITY);
        Runnable task = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Welcome to Multithreading");
                try {
                    Thread.sleep(10000); // Sleep for 10 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread printThread = new Thread(task);
        printThread.start();

        // Wait for the printThread to complete
        try {
            printThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}