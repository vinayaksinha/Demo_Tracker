package Programs_Basic;

import java.util.Scanner;

public class Addition {
	public static void main (String[] args){
		summation();
	}

	public static void summation(){
		
		Scanner obj = new Scanner(System.in);
		System.out.println("This program will help us to understand addition of two number...");
		System.out.print("Please enter first number: ");
		int num1 = obj.nextInt();
		System.out.print("Please enter second number: ");
		int num2 = obj.nextInt();
		int result = num1 + num2;
		System.out.println("Your result is: " + result);
		obj.close();
	}
}
