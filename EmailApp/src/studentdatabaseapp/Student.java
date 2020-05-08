package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tutionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;
    //Constructor:  prompt user to  enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Student first name: ");
		this.firstName = in.nextLine();
		System.out.print("Enter Student last name: ");
		this.lastName = in.nextLine();
		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		setStudentID();
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
		
		//Generate an ID	
		
	}
	private void setStudentID() {
		//Grade Level + ID
		id++;
		//String cov =  gradeYear + "" + id;
		this.studentID = gradeYear + "" + id;
		
	}
        	

	
	//Enroll in courses
	
	public void enroll() {
		//Get inside a loop, user hits 0
		do {
		System.out.println("Enter course to enroll (0 to quit): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if( !course.equals("Q") ) {
			courses = courses + "\n" + course;
			tutionBalance = tutionBalance + costOfCourse;
			
		}
		else { break; }
	} while (1 != 0);
		System.out.println("ENROLLED IN: " + courses);
		System.out.println("TUTION BALANCE: " + tutionBalance);
	}
	//View balance
	public void viewBalance() {
		System.out.println("Your balance is $" + tutionBalance);
	}
	
	//pay  the tution
	public void payTution( int payment ) {
		tutionBalance = tutionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
    //show status
}
