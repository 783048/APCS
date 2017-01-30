package whileLoopsLabs;

import java.util.Scanner;

public class DigitAvgRunner {
	public static void main ( String[] args )
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input number: ");
		int in = scan.nextInt();
		
		DigitAvg.avg(in);	
	}
}