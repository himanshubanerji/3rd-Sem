package pyqs;

import java.util.Scanner;

class A {
    private int a;

    A() {
        a = 0;
    }

    A(int a) {
        this.a = a;
    }

    int getNum() {
        return a;
    }

    void setNum(int a) {
        this.a = a;
    }

    void display() {
        System.out.println("Value of a is: " + a);
    }
}

class B {
    private int b;

    B() {
        b = 0;
    }

    B(int b) {
        this.b = b;
    }

    void display() {
        System.out.println("Value of b: " + b);
    }

    int getNum() {
        return b;
    }

    void setNum(int b) {
        this.b = b;
    }

}

public class swap {

    static void swapData(A ob1, B ob2) {
        int a = ob1.getNum();
        int b = ob2.getNum();
        a = a + b;
        b = a - b;
        a = a - b;
        ob1.setNum(a);
        ob2.setNum(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a and b: ");
        A ob1 = new A(sc.nextInt());
        B ob2 = new B(sc.nextInt());
        System.out.println("Objects before swapping: ");
        ob1.display();
        ob2.display();
        System.out.println("---------------------");
        System.out.println("Objects after swapping: ");
        swapData(ob1, ob2);
        ob1.display();
        ob2.display();

        sc.close();

    }
}
