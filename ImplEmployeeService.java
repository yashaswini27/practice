package com.cg.labbook.lab7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class ImplEmployeeService implements EmployeeService {
	HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();

	public HashMap<Integer, Employee> addEmployee(Integer id, Employee emp) {
		hm.put(id, emp);
		System.out.println("Added succesfully.");
		System.out.println(hm);
		
		return hm;
	}

	public ArrayList<Employee> getEmpDetailsScheme(String scheme) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		Collection<Employee> c = hm.values();
		for (Employee e: c) {
			if (e.getInsuranceScheme().equals(scheme)) {
				al.add(e);
				//System.out.println(e);
			}
		}
		//System.out.println(al);
		return al;
	}

	public void deleteEmployee(int empId) {
		hm.remove(empId);
		System.out.println("Succesfully deleted.");
		System.out.println(hm);
		
	}

	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Employee> getEmployeeDetailsScheme(String scheme) {
		// TODO Auto-generated method stub
		return null;
	}


	
	

}
