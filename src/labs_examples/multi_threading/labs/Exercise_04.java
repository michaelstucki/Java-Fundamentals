package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */
public class Exercise_04 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Job mr = new Job("Mr.", account,100);
        Job mrs = new Job("Mrs.", account, 50);
        Thread t1 = new Thread(mr, "Mr.");
        Thread t2 = new Thread(mrs, "Mrs.");
        t1.start();
        t2.start();
    }
}

class Job implements Runnable {
    private final String name;
    private final BankAccount account;
    private final int amountToSpend;
    Job(String name, BankAccount account, int amountToSpend) {
        this.name = name;
        this.account = account;
        this.amountToSpend = amountToSpend;
    }

    @Override
    public void run() { goShopping(amountToSpend); }
    private void goShopping(int amount) {
//        synchronized (account) {
            if (account.getBalance() >= amount) {
                System.out.println(name + " is about to spend");
                account.spend(amount);
                System.out.println(name + " finished spending");
            } else {
                System.out.println("Not enough for " + name);
            }
//        }
    }
}

class BankAccount {
    private int balance = 100;
    public int getBalance() { return balance; }
    public void spend(int amount) {
        balance -= amount;
        if (balance < 0) System.out.println("Overdrawn!");
    }
}
