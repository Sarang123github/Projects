package com.project;

import java.util.HashSet;

public class Hashsetclss {

	public static void main(String[] args) {
	
		
		HashSet <Integer> set =new HashSet <Integer>();
		
		set.add(10);
		set.add(30);
		set.add(50);
		set.add(70);
		set.add(90);
		
		for (Integer i:set) {
			System.out.println(i);
		}

	}

}
