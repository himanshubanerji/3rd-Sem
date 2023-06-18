package exceptionHandling;

import java.util.*;

class UDException extends Exception {
    int val;

    UDException(int val) {
        this.val = val;
    }

    public String toString() {
        return "user defined exception " + val + " generated";
    }
}

class UDExceptionDemo {

    static void compute(int a) throws UDException {
        if (a > 100)
            throw new UDException(a);
    }

    public static void main(String[] args) {
        try {
            compute(101);
        }
        catch (UDException ue) {
            System.out.println(ue);
        }
    }
}
