//program to find the addition of two matrices and display the resultant matrix

import java.util.Scanner;
class matrixAddition {
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows and columns in the matrix:");
		int row = sc.nextInt();
		int col = sc.nextInt();

		int arr1[][] = new int [row][col];
		int arr2[][] = new int [row][col];
		System.out.println("Enter the elements into maxtrix1");
		for(int i=0; i<row; i++)
			for(int j=0; j<col; j++)
				arr1[i][j] = sc.nextInt();

		System.out.println("Enter the elements into maxtrix2");
		for(int i=0; i<row; i++)
			for(int j=0; j<col; j++)
				arr2[i][j] = sc.nextInt();

		int resultant[][] = new int [row][col];

		for(int i=0; i<row; i++)
			for(int j=0; j<col; j++)
				resultant[i][j] = arr1[i][j] + arr2[i][j];
		System.out.println("The elements of the matrix are: ");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
				System.out.print(resultant[i][j]+" ");

			System.out.println();
		}
	}
}
