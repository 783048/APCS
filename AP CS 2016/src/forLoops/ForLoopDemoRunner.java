package forLoops;

import java.util.Scanner;

public class ForLoopDemoRunner
{
	public static void main ( String[] args )
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Start: ");
		int st = scan.nextInt();
		System.out.print("Stop: ");
		int en = scan.nextInt();
		System.out.print("Increment: ");
		int inc = scan.nextInt();
		ForLoopDemo.runForLoop(st, en, inc);
	}
}