package com.assigment.java;

public class Student {

	int marksMath;
	int markEnglish;
	int markphysics;

	public int getMarksMath() {
		return marksMath;
	}

	public void setMarksMath(int marksMath) {
		this.marksMath = marksMath;
	}

	public int getMarkEnglish() {
		return markEnglish;
	}

	public void setMarkEnglish(int markEnglish) {
		this.markEnglish = markEnglish;
	}

	public int getMarkphysics() {
		return markphysics;
	}

	public void setMarkphysics(int markphysics) {
		this.markphysics = markphysics;
	}

	public int getTotalMarks() {

		return (marksMath + markEnglish + markphysics);

	}

	Student() {

		marksMath = 90;
		markEnglish = 80;
		markphysics = 88;

	}
	
}
