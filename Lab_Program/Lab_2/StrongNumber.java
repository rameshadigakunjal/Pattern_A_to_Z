package Lab_Program.Lab_2;

import java.util.Scanner;
public class StrongNumber {
	
    // Method to calculate factorial of a digit
	static int factorial(int n) {
		int fact =1;
		for(int i=1;i<=n;i++){
				fact *=i;
	}
		return fact;
	}
    // Parameterized method to check if number is Strong or not

	static void checkStrong(int num) {
		int temp = num, sum = 0;
		
        //Loop through each digit of the number
		while(temp>0) {
			int digit = temp%10;
			sum +=factorial(digit);    // add factorial of the digit to sum
			temp /= 10;
		}
        //Compare sum with original number using ternary operator
		String result =(sum==num) 
				? (num + " is a strong number ") 
				: (num + " is not a strong number ");
		System.out.println(result);
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number: ");
		int  n = sc.nextInt();
		checkStrong(n);
	}
}

