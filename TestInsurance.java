package com.cg.labbook.lab7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

import com.cg.eis.exception.EmployeeException;

public class TestInsurance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id;
		String name, designation;
		double sal;
		String ans;
		int no;
		TreeSet<Employee> ts = new TreeSet<Employee>(new MyComparator());
		Employee emp;
		ImplEmployeeService ies = new ImplEmployeeService();
		do {
			System.out.println("Enter employee details: ");
			System.out.println("Enter ID: ");
			id = sc.nextInt();
			System.out.println("Enter name: ");
			name = sc.next();
			System.out.println("Enter salary: ");
			sal = sc.nextDouble();
			System.out.println("Enter designation: ");
			designation = sc.next();
			
				String str = "";
				if (sal > 5000 && sal < 20000) {
					str = "SchemeC";
				}
				else if (sal >= 20000 && sal < 40000) {
					str = "SchemeB";
				}
				else if(sal >= 40000) {
					str = "SchemeA";
				}
				else {
					str = "NoScheme";
				}
				emp = new Employee(id, name, sal, designation);
				emp.setInsuranceScheme(str);
				ts.add(emp);
				ies.addEmployee(id, emp);
			
			System.out.println("Services provided: ");
			System.out.println("1. View employee details based on Insurance Scheme.");
			System.out.println("2. Delete an employee.");
			System.out.println("3. sort employee details.");
			System.out.println("Please enter your choice: ");
			no = sc.nextInt();
			switch (no) {
			case 1: 
				System.out.println("Enter Scheme: ");
				String scheme = sc.next();
				ArrayList<Employee> arr = new ArrayList<Employee>();
				arr = ies.getEmpDetailsScheme(scheme);
				System.out.println(arr);
				break;
			
			case 2: 
				System.out.println("Enter id of the employee to be deleted: ");
				int empId = sc.nextInt();
				ies.deleteEmployee(empId);
				break;
				
			case 3: 
				System.out.println("The sorted employe details are: ");
				System.out.println(ts);
				break;
				
			default: 
				System.out.println("Please enter a valid choice.");
				break;
			}
			System.out.println("Do you want to continue? YES/NO: ");
			ans = sc.next();
		}
		while (ans.equals("YES") || ans.equals("Yes") || ans.equals("yes") || ans.equals("Y") || ans.equals("y"));
		
	}
	

}
