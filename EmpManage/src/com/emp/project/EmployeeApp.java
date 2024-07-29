package com.emp.project;

import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to perform specific operation :");
		
		System.out.println("1)Display all Employee \n 2)Create new Employee \n 3)Update Employee \n 4)Delete Employee");

		int n = sc.nextInt();
		
		operations(n);
		
	}
	
	public static void operations(int a) {
		
		switch(a) {
		
		case 1:
			new Employee().display();
			break;
			
		case 2:
			new EmployeeCreate().create();
			break;
			
		case 3:
			EmployeeUpdate.update();
			break;
			
		case 4:
			EmployeeDelete.delete();
			break;
			
		default:
			System.out.println("Enter a valid number");
		}
		
	}

}
