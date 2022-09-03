//program to search an element using linear search in java

import java.util.Scanner;
class linearSearch {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the elements into the array: ");
		for(int i=0; i<size; i++)
			arr[i] = sc.nextInt();

		System.out.println("Enter the elements to be searched: ");
		int k = sc.nextInt();

		int i;
		for(i=0; i<size; i++)
			if(arr[i] == k)
			{
				System.out.println(arr[i]+" is at index "+(i+1));
				break;
			}

			if(i == size)
				System.out.println("Element not found");

	}
}
