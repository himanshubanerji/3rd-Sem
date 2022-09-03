//program to insert an element into an array and delete an array from a position

import java.util.Scanner;
class insertDelete {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size+1];

		System.out.println("Enter the elements into the array: ");
		for(int i=0; i<size; i++)
			arr[i] = sc.nextInt();

		System.out.println("Input the position of the element to be inserted: ");
		int insert_pos = sc.nextInt();
		System.out.println("Enter the element to be inserted: ");
		int insert_ele = sc.nextInt();

		System.out.println("Input the position of the element to be deleted: ");
		int del_pos = sc.nextInt();

		insertDelete ob = new insertDelete ();
		ob.insertElement(arr, insert_pos, insert_ele);
		ob.deleteElement(arr, del_pos);
	}
	
	void insertElement (int arr[], int insert_pos, int k)
	{
		int size = arr.length;
		for(int i=size-1; i>insert_pos-1; i--)
		{
			arr[i] = arr[i-1];
		}

		arr[insert_pos-1] = k;

		System.out.println("Array after insertion of "+k+" at "+insert_pos+" is");
		for(int i=0; i<size; i++)
			System.out.print(arr[i]+" ");

		System.out.println();

	}

	void deleteElement (int arr[], int delete_pos)
	{
		int size = arr.length;
		for(int i=delete_pos-1; i<size-1; i++)
		{
			arr[i] = arr[i+1];
		}

		System.out.println("Array after deletion of element at position "+delete_pos+" is");
		for(int i=0; i<size-1; i++)
			System.out.print(arr[i]+" ");

		System.out.println();

	}

}
