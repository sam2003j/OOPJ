package oop4;
import java.util.Scanner;
public class Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int choice;
        do {
        	System.out.println("Enter your choice: ");
        	System.out.println("1. Programmer 2. Assistant Professor 3. Associate Professor 4. Professor 5. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
            case 1:
                Programmer p = new Programmer();
                p.getdata();
                p.displaydata();
                break;
            case 2:
                AssistantProfessor ap = new AssistantProfessor();
                ap.getdata();
                ap.displaydata();
                break;
            case 3:
                AssociateProfessor asp = new AssociateProfessor();
                asp.getdata();
                asp.displaydata();
                break;
            case 4:
                Professor prof = new Professor();
                prof.getdata();
                prof.displaydata();
                break;
            case 5:
                System.out.println("Exiting program.");
                break;
            default:
                System.out.println("Invalid choice!");
            }
        }while(choice!=5);
	}
}

