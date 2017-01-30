package whileLoopsLabs;

import java.util.Scanner;

public class DigitAdderRunner {
	public static void main ( String[] args )
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input number: ");
		int num = scan.nextInt();
		
		DigitAdder.counter(num);	
	}
}