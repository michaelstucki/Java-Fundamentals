package labs_examples.multi_threading.examples;

// No calls to wait() or notify().
class TickTock2 {
    String state; // contains the state of the clock
    synchronized void tick(boolean running) {
        if(!running) { // stop the clock
            state = "ticked";
            return;
        }
        System.out.print("Tick ");
        state = "ticked"; // set the current state to ticked
    }

    synchronized void tock(boolean running) {
        if(!running) { // stop the clock
            state = "tocked";
            return;
        }
        System.out.println("Tock");
        state = "tocked"; // set the current state to tocked
    }
}

class MyThread9a implements Runnable {
    Thread thrd;
    TickTock2 ttOb;

    // Construct a new thread.
    MyThread9a (String name, TickTock2 tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
        thrd.start(); // start the thread
    }

    // Begin execution of new thread.
    public void run() {
        if (thrd.getName().equals("Tick")) {
            for(int i=0; i<5; i++)
                ttOb.tick(true);
            ttOb.tick(false);
        }
        else {
            for(int i=0; i<5; i++)
                ttOb.tock(true);
            ttOb.tock(false);
        }
    }
}

class ThreadCom2 {
    public static void main(String args[]) {
        TickTock2 tt = new TickTock2();
        MyThread9a mt1 = new MyThread9a("Tick", tt);
        MyThread9a mt2 = new MyThread9a("Tock", tt);
        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}