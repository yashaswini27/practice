package com.cg.labbook.lab7;

public class Employee {
	int empId;
	String empName;
	double salary;
	String designation;
	String insuranceScheme;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int empId, String empName, double salary, String designation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.designation = designation;
	}


	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	@Override
	public String toString() {
		return "Employee [designation=" + designation + ", empId=" + empId
				+ ", empName=" + empName + ", insuranceScheme="
				+ insuranceScheme + ", salary=" + salary + "]";
	}
	
	public boolean equals(Object o) {
		Employee e = (Employee) o;
		boolean result = false;
		if(this.salary == e.salary) {
			result = true;
		}
		return result;
		
	}
	
	public int hashCode() {
		return this.empId;
	}


	public int compareTo(Object o) {
		Employee e = (Employee) o;
		if(this.salary == e.salary) {
			return 0;
		}
		if(this.salary > e.salary) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	
	
	
	
	

}
