package com.cg.labbook.lab7;

import java.util.ArrayList;
import java.util.HashMap;

public interface EmployeeService {
	public abstract HashMap<Integer, Employee> addEmployee(Integer id, Employee emp);
	public abstract ArrayList<Employee> getEmployeeDetailsScheme(String scheme);
	public abstract void deleteEmployee(Integer id);
	

}
