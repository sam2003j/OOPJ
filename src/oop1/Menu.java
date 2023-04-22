package oop1;
import java.util.Scanner;
public class Menu {
	public static void main(String[] args) {
		 	Scanner input = new Scanner(System.in);
	        
	        System.out.println("Enter the first complex number:");
	        double real1 = input.nextDouble();
	        double imaginary1 = input.nextDouble();
	        Complex c1 = new Complex(real1, imaginary1);
	        System.out.println("Enter the second complex number:");
	        double real2 = input.nextDouble();
	        double imaginary2 = input.nextDouble();
	        Complex c2 = new Complex(real2, imaginary2);
	        int choice=0;
	        Complex result;
	        while(choice != 5) {
	        	System.out.println("Select an operation:");
		        System.out.println("1. Addition");
		        System.out.println("2. Subtraction");
		        System.out.println("3. Multiplication");
		        System.out.println("4. Division");
		        System.out.println("5. Exit");
		        choice = input.nextInt();
		        switch (choice) {
	            case 1:
	                result = c1.add(c2);
	                System.out.println("Addition: " + result);
	                break;
	            case 2:
	                result = c1.subtract(c2);
	                System.out.println("Subtraction: " + result);
	                break;
	            case 3:
	                result = c1.multiply(c2);
	                System.out.println("Multiplication: " + result);
	                break;
	            case 4:
	                result = c1.divide(c2);
	                System.out.println("Division: " + result);
	                break;
	            case 5: 
	            	break;
	            default:
	                System.out.println("Invalid choice");
	                break;
		        }
	        }
        input.close();
	}
}

