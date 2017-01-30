package forLoops;

import static java.lang.System.*; 

public class ForLoopDemo
{
	//instance variables and constructors could be used, but are not really needed
	
	//runForLoop() will run a for loop from start to stop going up by increment
	public static void runForLoop(int start, int stop, int increment )
	{
		int count = 0;
		System.out.println("\n");
		for(int star = start; star < stop; star += increment)
		{
			int out = start + (increment * count);
			System.out.print(out + "  ");
			count++;
		}





	}
}