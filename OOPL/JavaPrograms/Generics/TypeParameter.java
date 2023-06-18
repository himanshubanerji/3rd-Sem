package Generics;

class Gen<T, V> {
    T ob1;
    V ob2;

    Gen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }
    
    //getter function
    T getGenT() {
        return ob1;
    }

    V genGenV() {
        return ob2;
    }
    
    void displayType() {
        System.out.println("This generic is of type "+ ob1.getClass().getName());
        System.out.println("This generic is of type "+ ob2.getClass().getName());
    }

}

class TypeParameter {
    public static void main(String[] args) {
        Gen<Integer, String> obj = new Gen<Integer, String> (20, "Himanshu");
        obj.displayType();
        System.out.println("Hello "+obj.genGenV()+" your age is "+obj.getGenT());
    }
}