

import java.util.Scanner;

class StackFullException extends Exception{
    int val;
    StackFullException(int x){
        super(" ");
        val = x;
    }
    public String toString(){
        return "Stack is full with index = " + val+1;
    }
}

class StackEmptyException extends Exception{
    StackEmptyException(){
        super("Stack is empty");
    }
}

class Stack{
    int []s;
    int i = -1 ;

    Stack(int n){
        s = new int[n];
    }

    void push(int x){
        if (i == s.length-1){
            try{
                throw new StackFullException(i);
            }
            catch (StackFullException sfe){
                System.out.println("ok");
            }
        }
        else{
            s[++i] = x;
        }
    }

    void pop() throws StackEmptyException{
        if (i == -1){
            throw new StackEmptyException();
        }
        else{
            System.out.println("Element poped = " + s[i--]);
        }
    }

    void display(){
        System.out.println("Your stack is :");
        for (int j = 0; j<=i; j++){
            System.out.println(s[j] + "\t");
        }
    }
}

class StackDemo{
    public static void main(String[] args){
        // throw new StackEmptyException();
        Stack s  = new Stack (5);
        int ele, ch;

        throw new java.lang.ArithmeticException();
        Scanner sc= new Scanner (System.in);
        do{
            System.out.println("--------------------------\nStack Menu\n1.Push\t2.Pop\t3.Display\t4.Exit");
            ch = sc.nextInt();
            switch(ch){
            case 1:
                ele = sc.nextInt();
                                    s.push(ele);
                break;
            case 2:
                try{
                    s.pop();
                }
                catch(StackEmptyException see){
                    System.out.println(see);
                }
                break;
            case 3:
                s.display();
                break;
            case 4:
                break;
            }
        }while(ch!=4);
    }
}
