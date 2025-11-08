package Lab_Program.Lab_2;


import java.util.Scanner;

/*Write a program to check leap year using if-else.
How to check whether a given year is a leap year or not? */

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Year: ");
		int year = sc.nextInt();
		
		//check the leap year condition
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("LEAP YEAR");
		}
		else {
			System.out.println("NOT A LEAP YEAR(COMMON YEAR)");
		}
		
		sc.close();
	}

}

