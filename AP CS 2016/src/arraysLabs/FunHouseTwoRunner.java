package arraysLabs;

import java.util.Arrays;

public class FunHouseTwoRunner 
{
	public static void main( String args[] )
	{
		//int[] one = {1,2,3,4,5,6,7,8,9,10};
		int[] one = {10,9,8,7,6,5,4,3,2,1};
		
		System.out.println(Arrays.toString(one));
		System.out.println("is going Up ? " + FunHouseTwo.goingUp(one));
		System.out.println("is going Down ? " + FunHouseTwo.goingDown(one));
	}
}
