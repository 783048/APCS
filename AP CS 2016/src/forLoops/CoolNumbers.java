package forLoops;

import static java.lang.System.*;

public class CoolNumbers 
{
	//static int count = 0;
	static int i = 0;

	public static Boolean isCoolNumber( int num )
	{
		if(num % 6 == 1 && num % 5 == 1 && num % 4 == 1)
			return true;
		return false;
	}
	
		/*
	 *method countCoolNumbers will return the count
	 *of the coolNumbers between 6 and stop
	 */
	public static int countCoolNumbers( int stop )
	{
		int count = 0;
		for(int i = 6; i < stop; i++)
		{
			if(isCoolNumber(i))
			count++;
			
		}
		return count;
	}
}