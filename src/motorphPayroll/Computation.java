package motorphPayroll;

import java.util.Scanner;

public class Computation {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		String name;
		int workingdays;
		double rateperday;
		double grosspay;
		double pagibig;
		double philhealth;
		double totaldeduction;
		double netpay;
		double sss = sssTable(grosspay); 
		
		System.out.print("Enter Name: ");
		name = input.nextLine();
		
		System.out.print("Enter Rate: ");
		rateperday = input.nextDouble();
		
		System.out.print("Enter Number of Days: ");
		workingdays = input.nextInt();
		
		//Computation
		
		grosspay = rateperday * workingdays;
		pagibig = grosspay * 0.02;
		philhealth = grosspay * 0.025;
		totaldeduction = pagibig + philhealth + sss;
		netpay = grosspay - totaldeduction; 
		
		//Print
		
		System.out.println();
		System.out.println("Employee Name: " + name);
		System.out.println("Gross Pay: " + grosspay);
		System.out.println();
		System.out.println("-----DEDUCTION-----");
		System.out.println("pagibig: " + pagibig);
		System.out.println("philhealth: " + philhealth);
		System.out.println("sss: " + sss);
		
	}

	public static double sssTable(double grosspay) {
		
		if (grosspay >= 22750 && grosspay < 23250) {
			return 1012.50;
		}else if (grosspay >= 23250 && grosspay < 23750) {
			return 1057.50;
		}else if (grosspay >= 23750 && grosspay < 24250) {
			return 1080.00;
		}else if (grosspay >= 24750 && grosspay < 25250) {
			return 1125.00;
		}else if (grosspay >= 29750) {
			return 1350.00;
		}else {
			return 00.00;
		}
	}
}
