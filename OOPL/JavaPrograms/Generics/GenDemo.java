package Generics;

class Gen<T> {
	T ob;
	Gen(T o) {
		ob = o;
	}
	//getter function
	T getOb() {
		return ob;
	}
	void displayGenerics() {
		System.out.println("The type of this generic class is "+ ob.getClass().getName());
	}
}
class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> ob = new Gen<Integer>(10);
        ob.displayGenerics();
        // int num = ob.getOb();
        // System.out.println("Value is: "+num);

        // Gen<String> s = new Gen<String>("Heman");
        // System.out.println("Hello " + s.getOb());
    }
}