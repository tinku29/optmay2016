package com.two95.assign.bub;

import java.util.Arrays;

public class Bub {

	public static void main(String[] args) {
		// initializing array
		int arr[] = { 10, 7, 3, 1, 9, 7, 4, 3 };
		System.out.println("Initial Array");
		//System.out.println(Arrays.toString(arr));
		bubbleSort(arr);

	}

	static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println("After pass " + (i + 1));
			// printing array after every pass
			System.out.println(Arrays.toString(arr));
		}

	}
}

/*
 * //Bubble sort import java.util.*; public class Solution{
 * 
 * public static void main(String[] args) { //initializing arr int arr[] =
 * {10,7,3,1,9,7,4,3}; System.out.println("Initial Array");
 * System.out.println(Arrays.toString(arr)); bubbleSort(arr);
 * 
 * } static void bubbleSort(int[] arr) { for (int i = 0; i < arr.length; i++) {
 * for (int j = 0; j < arr.length-i - 1; j++) { if (arr[j] > arr[j + 1]) { int
 * temp = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = temp; } }
 * System.out.println("After pass "+(i+1)); //printing array after every pass
 * System.out.println(Arrays.toString(arr)); }
 * 
 * 
 * 
 * }
 * 
 * }
 */