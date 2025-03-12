package SpringBootTutorial.AdvanceJava.Concurrency;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    private int balance = 100;
    private Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        lock.lock();  // Acquire the lock
        try {
            if (balance >= amount) {
                System.out.println(Thread.currentThread().getName() + " withdrawing " + amount);
                balance -= amount;
                System.out.println("New balance: " + balance);
            } else {
                System.out.println("Insufficient funds for " + Thread.currentThread().getName());
            }
        } finally {
            lock.unlock();  // Release the lock
        }
    }
}
public class UsingLock
{
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.withdraw(80), "User1");
        Thread t2 = new Thread(() -> account.withdraw(80), "User2");

        t1.start();
        t2.start();
    }
}