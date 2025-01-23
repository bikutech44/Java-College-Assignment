class BackgroundTask extends Thread {
    public void run() {
        while(true) {
            System.out.println("Background task is running...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class DaemonTask {
    public static void main(String[] args) {
        BackgroundTask t = new BackgroundTask();
        t.setDaemon(true); // Set the thread as daemon
        t.start(); // Start the daemon thread

        System.out.println("Main thread has finished.");
    }
}
