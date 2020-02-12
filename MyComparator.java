package com.cg.labbook.lab7;

import java.util.Comparator;

public class MyComparator implements Comparator{

	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		return e1.compareTo(e2);
	}

	

}
