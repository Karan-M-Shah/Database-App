package DatabaseApp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int year;
	private String studentID;
	private String courses = null;
	private int balance = 0;
	private static int courseCost = 600;
	private static int ID = 1000;
	
	//Constructor prompts for name & year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshmen\n2 - Sohpomore\n"
				+ "3 - Junior\n4 - Senior\nEnter student year: ");
		this.year = in.nextInt();
		
		setID();
	}
	
	//Generate ID
	private void setID()
	{
		ID++;
		this.studentID = year + "" + ID;
	}
	
	//Enroll in courses
	public void enroll()
	{
		//Inside a loop, user hits 0 to complete
		do
		{
			System.out.println("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q"))
			{
				courses = courses + "\n" + course;
				balance+= courseCost;
			}
			else { break; }
		} while (1 != 0);
	}
	
	//View balance
	public void viewBalance()
	{
		System.out.println("Your balance is: $" + balance);
	}
	
	//Pay tuition 
	public void payTuition()
	{
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		balance-= payment;
		System.out.println("Thank you for your payment of: $" + payment);
		viewBalance();
	}
	
	//Show status
	public String status()
	{
		return "Name: " + firstName + " " + lastName +
				"\nGrade: " + year + "\nID: " + ID +
				"\nCourses Enrolled: " + courses +
				"\nBalance: $" + balance + "\n";
	}
}
