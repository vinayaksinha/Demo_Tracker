package Programs_Basic;

import java.util.Scanner;

public class Division {
	public static void main (String[] args){
		division();
	}

	public static void division(){
		
		Scanner obj = new Scanner(System.in);
		System.out.println("This program will help us to understand division of two number...");
		System.out.print("Please enter first number: ");
		double num1 = obj.nextDouble();
		System.out.print("Please enter second number: ");
		double num2 = obj.nextDouble();
		double result = num1 / num2;
		System.out.println("Your result is: " + result);
		obj.close();
	}

}
