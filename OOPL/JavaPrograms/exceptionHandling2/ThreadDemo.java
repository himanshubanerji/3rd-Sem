
class myThread implements Runnable {
    String tname;

    myThread(String tname) {
        this.tname = tname;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(tname + i);
        }
        System.out.println("Exitting child thread");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        myThread ob = new myThread("child");
        Thread t = new Thread(ob);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main" + i);
        }
        System.out.println("Exitting main thread");
    }
}

