package com.home.assignment.two;

import java.util.Scanner;

public class EmployeeInformation {

	public EmployeeInformation() {

	}

	public static void main(String[] args) {
		String[] ID = new String[5];
		String[] Name = new String[5];
		double[] Salary = new double[5];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter employee id: = ");
			ID[i] = sc.nextLine();
			System.out.println("Enter employee name: = ");
			Name[i] = sc.nextLine();
			System.out.println("Enter employee salary: = ");
			Salary[i] = sc.nextDouble();
			sc.nextLine();

		}

		display(ID, Name, Salary);
		display(ID, Name);
		System.out.println("Enter employee name to Search for: = ");
		String name = sc.nextLine();
		display(name,ID, Name, Salary);
		

	}

	private static void display(String[] iD, String[] c, double[] salary) {
		System.out.println("ID\t\tName\t\tSalary");
		for (int i = 0; i < iD.length; i++) {
			System.out.println(iD[i] + "\t\t" + c[i] + "\t\t" + salary[i]);
		}

	}

	private static void display(String[] iD, String[] c) {
		System.out.println("ID\t\tName");
		for (int i = 0; i < iD.length; i++) {
			System.out.println(iD[i] + "\t\t" + c[i]);
		}

	}

	private static void display(String name, String iD[], String c[], double salary[]) {
		System.out.println("ID\t\tName\t\tSalary");

		for (int i = 0; i < iD.length; i++) {
			if (name.equals(c[i])) {
				System.out.println(iD[i] + "\t\t" + c[i] + "\t\t" + salary[i]);
			}
		}

	}

}
