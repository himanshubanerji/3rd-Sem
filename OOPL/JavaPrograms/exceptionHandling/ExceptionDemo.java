package exceptionHandling;

import java.util.Scanner;
class Exception {
    int a[], b[];

    Exception(int size1, int size2) {
        a = new int[size1];
        b = new int[size2];
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements into array1");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter elements into array2");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        sc.close();
    }

    void divide() {
        System.out.println("dividing array1 by array 2...");
        System.out.print("Resultant array is: ");
        try {
            for(int i = 0; i < a.length; i++) {
                System.out.println(a[i]/b[i]+" ");
            }
        }
        catch (ArithmeticException ob) {
            System.out.println("divide by 0 error");
            return;
        }
        catch (ArrayIndexOutOfBoundsException ob) {
            throw ob;
        }
        finally {
            System.out.println("Hi! from finally block");
        }
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the arrays: ");
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        
        Exception ob = new Exception(size1, size2);
        ob.input();
        try {
            ob.divide();
        }
        catch (ArrayIndexOutOfBoundsException aob) {
            System.out.println("arrays are not equal, index out of bounds generated");
        }

        sc.close();
    }
}