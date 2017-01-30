package whileLoopsLabs;

import java.util.Scanner;

public class DigitCounterRunner {
	public static void main ( String[] args )
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input number: ");
		int num = scan.nextInt();
		
		DigitCounter.counter(num);
	}
}