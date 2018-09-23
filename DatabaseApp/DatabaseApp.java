package DatabaseApp;

import java.util.Scanner;

public class DatabaseApp {

	public static void main(String[] args) {
		
		System.out.println("Enter number of students to enroll: ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		Student[] students = new Student[num];
		
		for(int i = 0; i < num; i++)
		{
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			System.out.println(students[i].status());
		}
	}
}
