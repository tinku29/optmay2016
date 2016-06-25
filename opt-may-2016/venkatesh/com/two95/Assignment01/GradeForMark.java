package com.two95.Assignment01;
import java.util.Scanner;

public class GradeForMark {

	public static void main(String[] args) {

		System.out.println("please your mark:");

		Scanner input = new Scanner(System.in);
		int mark = input.nextInt();
		String grade = grade(mark);

		System.out.println(grade);
	}

	public static String grade(int mark) {
		String grade = "";
		if (mark >= 0 && mark <= 100) {
			if (mark >= 0 && mark <= 34) {
				grade = "FAIL";
			} else if (mark >= 35 && mark <= 49) {
				grade = "C grade";
			} else if (mark >= 50 && mark <= 59) {
				grade = "B grade";
			} else if (mark >= 60 && mark <= 79) {
				grade = "A grade";
			} else if (mark >= 80 && mark <= 100) {
				grade = "A+ grade";
			}
		} else {
			grade = "invalid";
		}
		return grade;
	}
}
