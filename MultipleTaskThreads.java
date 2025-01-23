class FirstWorker extends Thread {
    public void run() {
        System.out.println("First worker is active");
    }
}

class SecondWorker extends Thread {
    public void run() {
        System.out.println("Second worker is active");
    }
}

public class MultipleTaskThreads {
    public static void main(String[] args) {
        FirstWorker t1 = new FirstWorker();
        SecondWorker t2 = new SecondWorker();

        t1.start(); // Start the first worker thread
        t2.start(); // Start the second worker thread
    }
}
