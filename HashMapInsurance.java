package com.cg.labbook.lab7;

import java.util.HashMap;
import java.util.Scanner;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.ImplEmployeeService;

public class HashMapInsurance {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap hm = new HashMap();
		
		Employee e1 = new Employee();
		System.out.println("Enter employee ID: ");
		e1.setId(sc.nextInt());
		System.out.println("Enter employee name: ");
		e1.setName(sc.next());
		System.out.println("Enter salary: ");
		e1.setSalary(sc.nextDouble());
		System.out.println("Enter designation: ");
		e1.setDesignation(sc.next());
		
		ImplEmployeeService ies = new ImplEmployeeService();
		e1.setInsuranceScheme(ies.findInsuranceScheme(e1.getSalary(), e1.getDesignation()));
		hm.put(1, e1);
		System.out.println(hm);
	}

}
