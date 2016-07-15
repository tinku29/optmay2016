package com.assignment.july9;

import java.util.Iterator;
import java.util.TreeSet;

public class StudentSortTest {

	public static void main(String[] args) {

		TreeSet set = new TreeSet(new LastNameComparator());
		
		set.add(new Student("Sankeerth", "Pinninti", 23, 178));
		set.add(new Student("Krishna", "Kalyanam", 24, 179));
		set.add(new Student("Abhilash", "Madhavaram", 25, 181));
		set.add(new Student("Jaise", "John", 24, 180));
		set.add(new Student("Sooraj", "Das", 24, 181));
		set.add(new Student("Nipul", "Guru", 24, 180));
		set.add(new Student("Venkatesh", "Balu", 24, 177));
		set.add(new Student("Kevin", "Santhosh", 22, 182));
		set.add(new Student("Sharanya", "Sharu", 25, 170));
		set.add(new Student("Anusha", "Rathikonda", 24, 171));
		set.add(new Student("Dayana", "Mallas", 25, 172));
		set.add(new Student("Bhavin", "Patel", 25, 181));
		
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			
			Student student = (Student) itr.next();
			System.out.println("First Name: " + student.getFirstName() 
			+ " | Last name: " + student.getLastName()
			+ " | Age: " + student.getAge() 
			+ " | Height: " + student.getHeight()+ " cms");
		}
 
	}

}
