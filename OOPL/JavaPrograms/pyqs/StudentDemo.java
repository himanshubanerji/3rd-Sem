package pyqs;

class Student {
    private String name;
    private int rollNo;
    private int arr[];
    static int i;

    Student() {
        arr = new int[5];
        name = " ";
        rollNo = 0;
    }

    Student(String name, int arr[]) {
        this.name = name;
        rollNo = i++;
        int j = 0;
        for (int x : arr) {
            this.arr[j++] = x;
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: ");
        for (int x : this.arr) {
            System.out.print(x + " ");
        }
    }

}

public class StudentDemo extends Student {
    public static void main(String[] args) {
        
    }
}