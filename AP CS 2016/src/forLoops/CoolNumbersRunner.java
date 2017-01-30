package forLoops;

import static java.lang.System.*;

import java.util.Scanner;

public class CoolNumbersRunner
{
	public static void main( String[] args )
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Input End Value: ");
		int i = scan.nextInt();;
		CoolNumbers test = new CoolNumbers();
		System.out.println( CoolNumbers.countCoolNumbers(i) + " cool numbers between 6 - " + i);
		//add more test cases
	}
}