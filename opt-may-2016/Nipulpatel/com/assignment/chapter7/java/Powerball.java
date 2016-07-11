/***************************************************************
 * @author Nipul								 date:7/11/2016 
 * project:Collection (Assignment 8)
 * Scope : Build a power ball program  using collections
 * Scope change : none
 * class : Main class
 * Test: Successfully every time  code shows new number.
 ***************************************************************/

package com.assignment.chapter7.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Powerball {

	public static void main(String[] args) {
		/************************ powerball1 ******************************/

		List<Integer> powerball1 = new ArrayList<>();

		int count = 0;

		for (int i = 1; i < 10; i++) {

			powerball1.add(count);

			count++;
		}

		Collections.shuffle(powerball1);

		int out = powerball1.get(1);

		System.out.print("Powerball is :- "+out);
		/************************ powerball2 ******************************/
		List<Integer> powerball2 = new ArrayList<>();
		int count2 = 0;
		for (int i = 1; i < 99; i++) {

			powerball2.add(count2);

			count2++;
		}
		Collections.shuffle(powerball2);

		int out2 = powerball2.get(1);

		System.out.print(" " + out2);
		/************************ powerball3 ******************************/
		List<Integer> powerball3 = new ArrayList<>();
		int count3 = 0;
		for (int i = 1; i < 99; i++) {

			powerball3.add(count3);

			count3++;
		}
		Collections.shuffle(powerball3);

		int out3 = powerball3.get(1);

		System.out.print(" " + out3);

		/************************ powerball4 ******************************/

		List<Integer> powerball4 = new ArrayList<>();
		int count4 = 0;
		for (int i = 1; i < 99; i++) {

			powerball4.add(count4);

			count4++;
		}
		Collections.shuffle(powerball4);

		int out4 = powerball4.get(1);

		System.out.print(" " + out4);
		/************************ powerball5 ******************************/
		List<Integer> powerball5 = new ArrayList<>();
		int count5 = 0;
		for (int i = 1; i < 99; i++) {

			powerball5.add(count5);

			count5++;
		}
		Collections.shuffle(powerball5);

		int out5 = powerball5.get(1);

		System.out.print(" " + out5);

	}

}
