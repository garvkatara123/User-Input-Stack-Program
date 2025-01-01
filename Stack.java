package DSA;

import java.util.Scanner;

public class stack {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    // push the element n the stack..
    public void push(int data) {
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    // pop/delete the element of the stack...
    public int pop() {
        if(head == null){
            System.out.println("stack is underflow!");
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }
    // print the peek element...
    public int peek() {
        if(head == null){
            System.out.println("stack is empty!..");
            return -1;
        }
        int top = head.data;
        return top;
    }
    // print the stack...
    public void printstack() {
        if(head == null){
            System.out.println("stack is empty!...");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }    
        System.out.println();    
    }

    public static void main(String[] args) {
        stack st = new stack();
        Scanner sc = new Scanner(System.in);
        int choice;
        do { 
            System.out.println("\nMenu:- ");
            System.out.println("\n1. push the data");
            System.out.println("\n2. pop/delete the data");
            System.out.println("\n3. find the peek element");
            System.out.println("\n4. print the stack");
            System.out.println("\n5. extit..");
            System.out.print("enter your choice:- ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter the data:- ");
                    int data = sc.nextInt();
                    st.push(data);
                    break;
                case 2:
                    int popped = st.pop();
                    if (popped != -1) {
                        System.out.println("Popped element: " + popped);
                    }
                    break;
                case 3:
                    int top = st.peek();
                    if (top != -1) {
                        System.out.println("Top element is: " + top);
                    }
                    break;
                case 4:
                    System.out.println("the satck elements are:- ");
                    st.printstack();
                    break;
                case 5:
                    System.out.println("exiting...");
                    break;
                default:
                    System.out.println("you enter invalid choice. \n pls enter valis choice..");
            }

        } while (choice != 5);
    }
    
}
