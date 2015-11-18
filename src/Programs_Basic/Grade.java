package Programs_Basic;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args){
		grade();
	}
	
	public static void grade(){
		int marks;
		char grade;
		Scanner obj = new Scanner(System.in);
		System.out.println("This program will help you get your grade based upon the number of marks you got ...!!!");
		System.out.print("Please enter your marks: ");
		marks = obj.nextInt();		
		
		if (marks >= 90){
			grade = 'A';
		}
		else if (marks >= 80){
			grade = 'B';
		}
		else if (marks >= 70){
			grade = 'C';
		}
		else if (marks >= 60){
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.println("Your grade based upon your marks is: " + grade);
		obj.close();
	}
}
