package com.github.encapsulation;

public class TrainerClass {
 
 			private String trainerName;
			private String course;
			private int courseDuration;
			private int fee;
			
			public String getTrainername() {
				return trainerName;
			}
			public void setTrainername(String trainerName) {
				this.trainerName = trainerName;
			}
			public String getCourse() {
				return course;
			}
			public void setCourse(String course) {
				this.course = course;
			}
			public int getCourseduration() {
				return courseDuration;
			}
			public void setCourseduration(int courseDuration) {
				this.courseDuration = courseDuration;
			}
			public int getFee() {
				return fee;
			}
			public void setFee(int fee) {
				this.fee = fee;
			}
			
			public String toString(){
				return "Trainer Name is " + trainerName + "\n course is " + course + "\n Course Duration is " + courseDuration + "\n Fee for course is "+ fee ;
			}

			

	}

 
