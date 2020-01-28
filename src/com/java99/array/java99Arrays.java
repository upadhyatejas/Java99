package com.java99.array;

public class java99Arrays {
	public void printArray(String breakfast[]) {
		System.out.println("\n***Output***");
		for(String s: breakfast) {
			System.out.print(s);	
		}
		System.out.println("\n");
	}
	
	public void lastelement(String breakfast[]) {
		System.out.println("\n***Output***");
		int lengthofArray = breakfast.length;
		int indexofArray  = lengthofArray - 2;
		System.out.println("the last but one element of the array will be ");
		System.out.println(breakfast[indexofArray]);
		System.out.println("\n");
	}
	
	public void reverseArray(String breakfast[]) {
		int lengthofArray = breakfast.length;
		String temp[] = new String[lengthofArray];
		int endIndex = lengthofArray -1 ;
		for(int i = 0 ; i < lengthofArray; i++,endIndex--) {
			temp [i] = breakfast[endIndex];
			
			}
		
		printArray(temp);
	}
	
	public void palindromicArray(String breakfast[]) {
		String a [] = breakfast;
		int startIndex = 0;
		int endIndex = a.length-1;
		for(int i = 0;i<a.length; i++ ) {
			if(a[startIndex].equals(a[endIndex])){
				
			}
			else
				System.out.println("not a palindrome");
		}

	}
}