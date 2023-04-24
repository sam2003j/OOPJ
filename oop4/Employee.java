package oop4;
import java.util.Scanner;
public class Employee {
		String name, address, mailid;
		long num;
		int id;
		double Basic_Pay, DA, HRA, PF;
		Employee(){
			name="";
			address="";
			mailid="";
			num=0;
			id=0;
		}
		void getdata() {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Name: ");
			name=sc.next();
			System.out.println("Enter Address: ");
			address=sc.next();
			System.out.println("Enter Mailid: ");
			mailid=sc.next();
			System.out.println("Enter ID: ");
			id=sc.nextInt();
			System.out.println("Enter Number: ");
			num=sc.nextLong();
			System.out.println("Enter basic pay: ");
	        Basic_Pay = sc.nextDouble();
	        DA = 0.1 * Basic_Pay;
	        HRA = 0.12 * Basic_Pay;
	        PF = 0.001 * Basic_Pay;
		}
		void displaydata() {
			double Gross_Salary = Basic_Pay + DA + HRA;
	        double Net_Salary = Gross_Salary - PF;
	        System.out.println("PAYSLIP:");
			System.out.println("Name: "+name);
			System.out.println("Address: "+address);
			System.out.println("Mailid: "+mailid);
			System.out.println("ID: "+id);
			System.out.println("Number: "+num);
			System.out.println("Basic Pay: " + Basic_Pay);
		    System.out.println("DA: " + DA);
		    System.out.println("HRA: " + HRA);
		    System.out.println("PF: " + PF);
		    System.out.println("Gross Salary: " + Gross_Salary);
		    System.out.println("Net Salary: " + Net_Salary);
		}
}
class Programmer extends Employee {
	    public void displaydata() {
	        super.displaydata();
	    }
}
class AssistantProfessor extends Employee {
	    public void displaydata() {
	        super.displaydata();
	    }
}
class AssociateProfessor extends Employee {
	    public void displaydata() {
	        super.displaydata();
	    }
}
class Professor extends Employee {
	    public void displaydata() {
	        super.displaydata();
	   }
}


