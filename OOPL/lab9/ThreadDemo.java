class Table extends Thread{
    String threadName;
    int n;
    Thread t;
    Table(String threadName,int n){
        this.threadName = threadName;
        this.n = n;
        t = new Thread(this,this.threadName);
        System.out.println("Child thread "+this);
        t.start();
    }

    @Override
    public String toString() {
        return this.threadName;
    }

    @Override
    public void run(){
        try{
            for(int i = 1; i<= 10;i++){
                System.out.println(i+"*"+n+": "+i*n);
                Thread.sleep(100);
                // System.out.println("Child Thread Finished");
            }
        }
        catch(InterruptedException e){
            System.out.println(threadName+" interrupted");
        }
        
    }
}

class ThreadDemo{
    public static void main(String args[]){
        Table ch1 = new Table("Multiplication of 5:",5);
        Table ch2 = new Table("Multiplication of 7:",7);

        try{
            Thread.sleep(1000);
            System.out.println(ch1 + "child thread finished");
            System.out.println(ch2 + "child thread finished");
        }
        catch(InterruptedException e){
            System.out.println("Exited");
        }
        System.out.println("Main Thread Exiting...");
    }
}