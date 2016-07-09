package com.two95.training.chapter6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowableExample {


	public static void main(String args[]) {
		FileInputStream fileInputStreamObj1 = null;
		FileInputStream fileInputStreamObj2 = null;
		String fileName = "foo.bar";
		// String fileName = null;

		System.out.println("main: Starting " + ThrowableExample.class.getName() + " with file name = " + fileName);

		// get file input stream 1
		try {
			fileInputStreamObj1 = f1(fileName);
		} catch (Exception ex) {
			System.out.println("main: Oops, general exception caught");
		} catch (Throwable th) {
			System.out.println("main: Oops, throwable object caught");
		}

		// get file input stream 2
		fileInputStreamObj2 = f2(fileName);

		System.out.println("main: " + ThrowableExample.class.getName() + " ended");
	}
	
	/**
	 * Throws Error
	 * @param fileName
	 * @return
	 */
	private static FileInputStream f1(String fileName) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(fileName);
		} catch (FileNotFoundException ex) {
			System.out.println("f1: Oops, FileNotFoundException caught");
			throw new Error("f1: File not found");
		}
		System.out.println("f1: File input stream created");
		return fis;
	}

	/**
	 * Eats FileNotFoundException and resturns input stream
	 * @param fileName
	 * @return
	 */
	private static FileInputStream f2(String fileName)
	  {
	    FileInputStream fis = null;
	    try
	    {
	      fis = new FileInputStream(fileName);
	    }
	    catch (FileNotFoundException ex)
	    {
	      System.out.println("f2: Oops, FileNotFoundException caught");
	      return fis;
	    }
	    finally
	    {
	      System.out.println("f2: finally block");
	      return fis;
	    }
	  }

}
