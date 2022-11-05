import java.util.Scanner;

class Store{
    int items;
    boolean itemPre = true;

    synchronized void put (int i){
        if (itemPre == false){
            try{
                wait();
            }
            catch (InterruptedException e){
                items = i;
                System.out.println("Put: " + items);
                itemPre = false;
                notify();
            }
        }
    }

    synchronized int getVal(){
        if (itemPre == true){
            try{
                wait()Val;
            }
            catch(InterruptedException){
                System.out.println("Got: " + items);
                itemPre = true;
                notify();
                return items;
            }
        }
    }
}

class Producer implements Runnable{
    Thread t;
    Store s;
    int i = 1;
    Producer(Store s){
        this.s = s;
        t = new Thread(this);
        t.start();
    }
    public void run(){
        while (true){
            s.put(i++);
        }
    }
}

class Consumer implements Runnable{
    Thread t;
    Store s;
    Producer(Store s){
        this.s = s;
        t = new Thread(this);
        t.start();
    }
    public void run(){
        while (true){
            s.getVal();
        }
    }
}