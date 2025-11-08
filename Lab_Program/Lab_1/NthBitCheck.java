package Lab_Program.Lab_1;


import java.util.Scanner;

/*2.	Write a program to declare two variables num and n and take input during 
 compilation time to check whether the nth bit of the given number is set (1) or not (0). */

public class NthBitCheck {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();   //num => integer number
		
		System.out.println("Enter the bit position: ");
		int n = sc.nextInt();   // n => bit position
		
		int bitStatus = (num >> n) & 1;  // using Right shift operator along with bitwise AND operator
		
		// check the condition 
		if(bitStatus == 1)
			System.out.println("Bit position is SET(1)");
		else
			System.out.println("Bit at position is not SET(0)");
		
		sc.close();
		
		//output process of 10 in bit position of 2 is: 
		//               3210
		//               ||||
		//Binary of 10 = 1010
		//Bit at position 2 = 0
		
	}

}
