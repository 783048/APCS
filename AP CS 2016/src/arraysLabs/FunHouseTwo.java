package arraysLabs;

import java.lang.System;

public class FunHouseTwo 
{
	public static boolean goingUp(int[] numArray)
	{
		for(int i = 0; i < numArray.length; i++)
		{
			if(i < numArray.length - 1)
				if(numArray[i] >= numArray[i+1])
					return false;
		}
		return true;
	}
	
	public static boolean goingDown(int[] numArray)
	{
		for(int i = 0; i < numArray.length; i++)
		{
			if(i < numArray.length - 1)
				if(numArray[i] <= numArray[i+1])
					return false;
		}
		return true;
	}
}
