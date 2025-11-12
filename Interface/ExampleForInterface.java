package Interface;

import java.util.Scanner;

interface Calculator{
	void add();
	void sub();
	
}
class MyCal implements Calculator{
	public void add() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	public void sub() {
		int a = 10;
		int b = 20;
		int c = a-b;
		System.out.println(c);
}
}

class MyCal2 implements Calculator{

		public void add() {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the furst  number: ");
			int a =sc.nextInt();
			System.out.println("Enter the second number: ");
			int b = sc.nextInt();
			int c = a+b;
			System.out.println("Addition: " +c);
			}
		public void sub() {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the first  number: ");
			int a =sc.nextInt();
			System.out.println("Enter the second number: ");
			int b = sc.nextInt();
			int c =a-b;
			System.out.println("subtraction " +c);
			}
	}

public class ExampleForInterface {
	public static void main(String[] args) {
		MyCal m1 = new MyCal();
		MyCal2 m2 = new MyCal2();
		
		m1.add();
		m1.sub();
		
		m2.add();
		m2.sub();
}
}



/* 
 * output:
 30
-10
Enter the furst  number:
Enter the furst  number:
25
Enter the second number:
25
Addition: 50
Enter the first  number:
25
Enter the second number:
24
subtraction 1
 */
