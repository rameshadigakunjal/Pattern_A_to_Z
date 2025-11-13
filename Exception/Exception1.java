package Exception;

import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		System.out.println("Enter the numerator");
		int number1 = s.nextInt();
		System.out.println("Enter the denominator");
		int number2 = s.nextInt();

		try {
			int div = number1 / number2;
			System.out.println(div);
		}
		catch(Exception e) {
			System.out.println("Cannot divide by zero");
		}
    }
}
