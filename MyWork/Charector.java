package MyWork;

import java.util.Scanner;

/*Problem statement Write a program that takes a character as input and prints either 1, 0, or -1 
according to the following rules. 1, 
if the character is an uppercase alphabet (A - Z) 0, 
if the character is a lowercase alphabet (a - z) -1, 
if the character is not an alphabet */

public class Charector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0); // Take a single character input

        // Check for uppercase alphabet
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(1);
        }
        // Check for lowercase alphabet
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println(0);
        }
        // If not an alphabet
        else {
            System.out.println(-1);
        }

        sc.close();
    }
    
}
