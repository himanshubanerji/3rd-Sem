package pyqs;

import java.util.Scanner;

public class lcm {

    static int gcd(int a, int b) {
        if (a == 0)
            return b;

        return gcd(b % a, a);
    }

    static int findLCM(int a, int b) {
        int gcd = gcd(a, b);
        return (a * b) / gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        int lcm = findLCM(a, b);
        System.out.println("LCM: " + lcm);

        sc.close();
    }
}
