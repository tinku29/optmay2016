package com.assignment.july9;

import java.util.Scanner;

public class MaximumTest {
	
	public static < T extends Comparable<T>> T maximum(T x, T y, T z)
	{
		T max = x;
		if ( y.compareTo(max) > 0 ){
			max = y;
		}
		if ( z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		System.out.println("Enter the integers:");
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		int i3 = sc.nextInt();
		System.out.println("Max of " + i1 + ", " + i2 + " and " + i3 + " is " + maximum(i1,i2,i3));
		Scanner st = new Scanner( System.in );
		System.out.println("Enter the Strings:");
		String e1 = st.nextLine();
		String e2 = st.nextLine();
		String e3 = st.nextLine();
		System.out.println("Max of " + e1 + ", " + e2 + " and " + e3 + " is " + maximum(e1,e2,e3));
		System.out.println("Enter the double values:");
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		double d3 = sc.nextDouble();
		System.out.println("Max of " + d1 + ", " + d2 + " and " + d3 + " is " + maximum(d1,d2,d3));
		
		sc.close();
		st.close();
	}

}
