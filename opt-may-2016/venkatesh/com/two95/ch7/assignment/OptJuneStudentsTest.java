package com.two95.ch7.assignment;
import java.util.ArrayList;
import java.util.List;

public class OptJuneStudentsTest {

	public static void main(String[] args) {
		List students = new ArrayList<OptJuneStudents>();
		students.add(new OptJuneStudents("venkatesh", "sb1992v@gmail.com"));
		students.add(new OptJuneStudents("sankeerth", "sanky@gmail.com"));
		students.add(new OptJuneStudents("soorej", "soojej@gmail.com"));
		students.add(new OptJuneStudents("krishna", "kris123@gmail.com"));
		students.add(new OptJuneStudents("anusha", "anu12@gmail.com"));
		students.add(new OptJuneStudents("dayana", "daya190@gmail.com"));

		OptJuneStudents.display(students);
		
		
		
		
	}

}
