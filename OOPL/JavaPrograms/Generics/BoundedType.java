package Generics;

class Gen<T extends Number> {
    T o; //this o can only be of Number type now

    Gen(T o) {
        this.o = o;
    }

    double reciprocal() {
        return 1 / o.doubleValue();
    }

    double fractionalComp() {
        return o.doubleValue() - o.intValue();
    }
}

public class BoundedType {
    public static void main(String[] args) {
        Gen<Double> gd = new Gen<Double>(5.67);
        // Gen<Integer> gi = new Gen<Integer>(5);

        double d = gd.reciprocal();
        System.out.println("The reciprocal of d is "+d);
        System.out.println("The fractional component is "+ gd.fractionalComp());

        // if(gi.absEqual(gd)) System.out.println("abs value is equal");

    }
}
