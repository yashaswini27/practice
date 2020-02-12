package com.cg.labbook.lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringArray {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product: ");
		for(int i = 0; i < 10; i++) {
			al.add(sc.next());
		}
		System.out.println("Array before sorting: "+ al);
		
		Collections.sort(al);
		System.out.println("Array after sorting :");
		for(String s : al) {
			System.out.println(s);
		}
				
	}

}
