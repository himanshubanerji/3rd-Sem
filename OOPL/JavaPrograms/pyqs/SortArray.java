package pyqs;

import java.util.Scanner;;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array: ");
        int check = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : arr) {
            if (check <= x)
                check = x;
            else {
                System.out.println("Not sorted!");
                return;
            }
        }

        System.out.println("Sorted!");

        sc.close();
    }
}
