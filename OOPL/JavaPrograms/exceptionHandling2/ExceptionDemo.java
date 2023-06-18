import java.util.Scanner;

class ExceptionDemo {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,7};
        int denom[] = {1,0,1,2,0};


        for(int i=0; i<num.length; i++) {
            try {
                System.out.println(num[i]/denom[i]);
            }
            catch (Exception e) {
                System.out.println("Attempt to divide by 0");
            }
            catch(ArrayIndexOutOfBoundsException aob) {
                System.out.println("This index is unaccessable");
            }
        }
    }
}
