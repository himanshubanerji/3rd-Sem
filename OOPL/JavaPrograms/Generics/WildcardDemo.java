package Generics;

class Wildcard<T extends Number> {
    T num;

    Wildcard(T num) {
        this.num = num;
    }

    double reciprocal() {
        return 1 / num.doubleValue();
    }

    double fractionalPart() {
        return num.doubleValue() - num.intValue();
    }

    boolean absEqual(Wildcard<?> ob) {
        return Math.abs(this.num.doubleValue()) == Math.abs(ob.num.doubleValue());
    }

}

public class WildcardDemo {
    public static void main(String[] args) {
        Wildcard<Double> ob = new Wildcard<Double>(4.0);
        System.out.println(ob.reciprocal());
        System.out.println(ob.fractionalPart());
        Wildcard<Integer> ob1 = new Wildcard<Integer>(-4);
        System.out.println(ob1.absEqual(ob));
    }
}
