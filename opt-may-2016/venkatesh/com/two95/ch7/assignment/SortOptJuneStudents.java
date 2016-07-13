package com.two95.ch7.assignment;
import java.util.Iterator;
import java.util.TreeSet;

public class SortOptJuneStudents {

	public static void main(String[] args)
	{
		TreeSet<OptJuneStudents> list = new TreeSet<OptJuneStudents>();
		list.add(new OptJuneStudents( "soorej","prakash","soorej@gmail.com",24,5.7));
		list.add(new OptJuneStudents("venkatesh","sudha","venky@gmail.com",23,5.8));
		list.add(new OptJuneStudents("anusha","rao","rao@gmail.com",26,5.9));
		list.add(new OptJuneStudents("nipul","patel","nipu@gmail.com",21,5.5));


		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			OptJuneStudents student=(OptJuneStudents)itr.next();
			System.out.println(student.getFirstName()+" "+student.getLastName()+" "+student.getAge()+" "+student.getHeight());
		}
		System.out.println("-----------------------");
		TreeSet<OptJuneStudents> list1 = new TreeSet<OptJuneStudents>(new LastNameComparator());
		list1.add(new OptJuneStudents( "soorej","zrakash","soorej@gmail.com",24,5.7));
		list1.add(new OptJuneStudents("venkatesh","sudha","venky@gmail.com",23,5.8));
		list1.add(new OptJuneStudents("anusha","rao","rao@gmail.com",26,5.9));
		list1.add(new OptJuneStudents("nipul","patel","nipu@gmail.com",21,5.5));
		
		Iterator itr1=list1.iterator();
		while(itr1.hasNext())
		{
			OptJuneStudents student1=(OptJuneStudents)itr1.next();
			System.out.println(student1.getFirstName()+" "+student1.getLastName()+" "+student1.getAge()+" "+student1.getHeight());
		}
	}
	
	
	
	
}
