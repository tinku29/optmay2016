package com.assignment.july9;

public class GenericMethodTest {

	public static void main(String[] args) {
		
		Integer[] intArray = {10, 43, 3, 21, 42};
		Double[] doubleArray = {3.14, 1.74, 6.302, 1.8};
		Character[] charArray = {'J', 'A', 'G', 'U', 'A', 'R'};
		
		System.out.println("Array 'integer' contains: ");
		printArray(intArray);
		
		System.out.println("Array 'double' contains: ");
		printArray(doubleArray);
		
		System.out.println("Array 'char' contains: ");
		printArray(charArray);

	}
	
	public static < E > void printArray( E[] inputArray)
	{
		for(E element : inputArray){
			System.out.print(element + " ");
		}
		System.out.println();
	}

}
