package com.concordia.algo;

import java.util.ArrayList;
import java.util.List;

public class ListVArray {
	
	/*
	 * Learning:
	 * Arrays are of fix size.
	 * List can grow in size.
	 * Array any member can be acessed directly.
	 * List there are method defined to manipulate data.
	 * As a developer we should use array.
	 * List changes primitive to Integer objects.
	 * 
	 */

	int anArr[]={33,3,4,5};	
	List<Integer> anList = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListVArray obj = new ListVArray();
		obj.anArr[3] = 22;
		System.out.println("An Array: ");
		System.out.println(obj.anArr[3]);
		
		obj.anList.add(33);
		obj.anList.add(3);
		obj.anList.add(4);
		obj.anList.add(22);
		System.out.println("An List: ");
		System.out.println(obj.anList.get(obj.anList.indexOf(22)));
		
	}

}
