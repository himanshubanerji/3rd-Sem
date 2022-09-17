//program to implement a stack

import java.util.Scanner;
class Stack {
	private int arr[];
	private int tos; //top of stack

	Stack(int size)
	{
		arr = new int [size];
		tos = -1;
	}

	void push(int ele) {
		if(IsFull())
		{
			System.out.println("Stack Overflow!");
			System.exit(1); //unsuccessful termination
		}

		arr[++tos] = ele;
	}

	int pop() {
		if(IsEmpty())
		{
			System.out.println("Stack Empty");
			System.exit(1); //unsuccessful termination
		}
			return (arr[tos--]);
	}

	private boolean IsFull() {
		return ( tos == arr.length-1 );
	}

	private boolean IsEmpty() {
		return ( tos == -1 );
	}

	void display () {
		System.out.print("[");
		for(int i=0; i<=tos; i++)
			System.out.print(arr[i]+" ");
		System.out.println("]");
	}
}

class StackDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the stack: ");
		int size = sc.nextInt();

		Stack stack = new Stack(size);
		System.out.print("Enter the first element: ");
		int ele = sc.nextInt();
		stack.push(ele);

		String input = " ";
		while (!input.equals("exit"))
		{
			System.out.print("push,pop or exit? ");
			input = sc.next();
			if(input.equals("push"))
			{
				System.out.print("Input a number to push: ");
				ele = sc.nextInt();
				stack.push(ele);
				stack.display();
			}
			else if(input.equals("pop"))
			{
				ele = stack.pop();
				System.out.println("Popping "+ele);
				stack.display();
			}
			else if(input.equals("exit"))
			{
				System.out.println("Exiting...");
			}
			else 
				System.out.println("Invalid Input, try again");

		}
		sc.close();
	}
}
