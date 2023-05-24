package oop7;
import java.util.Scanner;

public class Stack {
    private int[] array;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = -1;
    }
    public void push(int value) throws Overflow {
        if (top == capacity - 1) {
            throw new Overflow("Stack Overflow: The stack is full.");
        }
        array[++top] = value;
        System.out.println("Element pushed: " + value);
    }
    public int pop() throws Underflow {
        if (top == -1) {
            throw new Underflow("Stack Underflow: The stack is empty.");
        }
        int poppedElement = array[top--];
        System.out.println("Element popped: " + poppedElement);
        return poppedElement;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the stack: ");
        int capacity = scanner.nextInt();
        Stack stack = new Stack(capacity);
        int choice;
        do {
            System.out.println("\nStack Menu");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter the element to push: ");
                        int element = scanner.nextInt();
                        stack.push(element);
                        break;
                    case 2:
                        stack.pop();
                        break;
                    case 3:
                        System.out.println("Exiting the program...");
                        break;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                        break;
                }
            } catch (Overflow e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Underflow e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (choice != 3);
        scanner.close();
    }
}
class Overflow extends Exception {
    public Overflow(String message) {
        super(message);
    }
}

class Underflow extends Exception {
    public Underflow(String message) {
        super(message);
    }
}

