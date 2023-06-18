package multithreading;

class myThread implements Runnable {
    Thread t;

    /*
     * myThread(String tname) {
     * this.tname = tname;
     * }
     */

    myThread(String tname) {
        t = new Thread(this, tname);
        t.start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(t.getName() + i);
        }
        System.out.println("Exitting child thread");
    }
}

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        // myThread ob = new myThread("child");
        new myThread("Child");
        // Thread t = new Thread(ob);
        // t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main" + i);
            // Thread.sleep(100);
        }
        System.out.println("Exitting main thread");
    }
}
