package com.two95.ch7.assignment;
import java.util.ArrayList;

public class GenericsExample {

	public static <E> void printArray(E[] inputArray) {
		for (E e : inputArray) {
			System.out.println(e);
		}
	}

	public static <T> void printList(ArrayList<T> values) {
		for (T t : values) {
			System.out.println(t);
		}
	}

	public static void main(String[] args) {
		Integer[] numbers = { 1, 2, 3, 4, 5 };
		String[] colors = { "red", "blue", "green" };

		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(2);
		number.add(24);
		number.add(52);
		number.add(82);
		number.add(26);

		printArray(colors);
		System.out.println();
		printArray(numbers);
		System.out.println();
		printList(number);

		ArrayList list = new ArrayList();
		list.add(1);
		list.add("str");
		for (Object o : list) {

			System.out.println(o);
		}

		System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5, maximum(3, 4, 5));

		System.out.printf("Maxm of %.1f,%.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));

		System.out.printf("Max of %s, %s and %s is %s\n", "pear", "apple", "orange",
				maximum("pear", "apple", "orange"));

	}

	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}

}
