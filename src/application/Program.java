package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Employee func = new Employee();
		
		System.out.print("Name: ");
		func.name = sc.nextLine();
		System.out.print("Gross salary: ");
		func.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		func.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + func);
		
		double percent;
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		percent = sc.nextDouble();
		func.increaseSalary(percent);
		
		System.out.println();
		System.out.println("Updated data: " + func);
		
		sc.close();
	}

}
