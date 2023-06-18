package multithreading;

class myThread {
    void multiply(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }
}

class Tables{
    int n;

    Tables(int n) {
        
    }
}

public class TableDemo {
    public static void main(String[] args) {
        myThread ob = new myThread();
    }
}
