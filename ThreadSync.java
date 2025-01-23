class BankAccount {
    private int balance = 1200;
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance-= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + " but insufficient funds.");
        }
    }
}
public class ThreadSync {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Runnable withdrawTask = ()-> account.withdraw(1000);
        Thread user1 = new Thread(withdrawTask, "User 1");
        Thread user2 = new Thread(withdrawTask, "User 2");
        user1.start();
        user2.start();
    }
}
