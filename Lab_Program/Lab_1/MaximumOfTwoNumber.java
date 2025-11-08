package Lab_Program.Lab_1;


import java.util.Scanner;

//maximum between the two numbers using the conditional/ternary operator.

public class MaximumOfTwoNumber {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		 
		//first number 
		System.out.println("Enter the first Number: ");
		int num1 = sc.nextInt();
		
		//Second number 
		System.out.println("Enter the Second Number: ");
		int num2 = sc.nextInt();
		
		int max = (num1>num2) ? num1 : num2;
		
		System.out.println("The maximum between "+ num1 + " and " + num2 + " is: " + max);
		
		sc.close();		
	}

}

