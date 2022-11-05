class Matrix implements Runnable{
    String threadName;
    Thread t;
    int n;
    int sum=0;
    int mat[][];
    Matrix(String name,int n,int mat[][]){
        threadName = name;
        this.mat = mat;
        this.n = n;
        t = new Thread(this,threadName);
        // System.out.println("Thread sum of "+this+" ");
        t.start();
    }

    @Override
    public String toString() {
        return this.threadName;
    }

    @Override
    public void run(){
        try{
            for(int i =0;i<mat[n].length;i++){
                sum += mat[n][i];
                Thread.sleep(10);
            }
        }
        catch(InterruptedException e){
            System.out.println(threadName+" Exiting");
        }
    }

    int getSum(){
        return sum;
    }
}

class MatrixDemo{
    public static void main(String args[]){
        int mat[][] ={{2,4,6},{1,3,5}};
        Matrix t1 = new Matrix("row1", 0, mat);
        Matrix t2 = new Matrix("row2", 1, mat);

        try{
            Thread.sleep(100);
            System.out.print("Thread sum of "+t1+" ");
            System.out.println(t1.getSum());
            System.out.print("Thread sum of "+t2+" ");
            System.out.println(t2.getSum());
            System.out.println("Main Thread Sum: "+(t1.getSum()+t2.getSum()));
            
        }
        catch(InterruptedException e){
            System.out.println("Exiting");
        }
        System.out.println("Main Thread Exiting...");
    }
}