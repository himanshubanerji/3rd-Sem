//program to bubble sort in either ascending and descending order

import java.util.Scanner;
class sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int arr[] = new int [n];
		System.out.println("Input the elements of the array: ");
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();

		bubbleSort obj = new bubbleSort();
		obj.sort(arr);
	}
}

class bubbleSort {
	public void sort (int arr[]) {

		System.out.println("Ascending order: ");
		int n = arr.length;
		for(int i=0; i<n-1; i++)
		{
			for(int j=i+1;j<n;j++)
				if(arr[i] > arr[j])
				{
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
		}
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");

		System.out.println();

		System.out.println("Descending order: ");
		for(int i=0; i<n-1; i++)
		{
			for(int j=i+1;j<n;j++)
				if(arr[i] < arr[j])
				{
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
		}
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");



	}
}

