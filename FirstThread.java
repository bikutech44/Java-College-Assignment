class WorkerThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Worker thread iteration: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class
FirstThread {
    public static void main(String[] args) {
        WorkerThread t = new WorkerThread();
        t.start(); // Start the thread
    }
}
