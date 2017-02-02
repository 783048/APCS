package arraysLabs;

import java.util.Arrays;

public class OddsAndEvensRunner {
	public static void main( String args[] )
	{
		int[] one = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(one));
		System.out.println("\nOdds = " + Arrays.toString(OddsAndEvens.odds(one)));
		System.out.println("Evens = " + Arrays.toString(OddsAndEvens.evens(one)));
		
	}
}
