class TaskRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class TaskThread {
    public static void main(String[] args) {
        TaskRunnable task = new TaskRunnable();
        Thread t = new Thread(task);
        t.start(); // Start the thread
    }
}
