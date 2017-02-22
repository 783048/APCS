package arrayListLabs;

import java.util.ArrayList;

public class NumberAnalyzer {
	public static int[] evenOdd(ArrayList<Integer> array){

		int[] temp = new int[3];
		for(int i = 0; i < array.size(); i++){
			if(Number.evenOdd(array.get(i)))
				temp[1]++;
			else temp[0]++;
			if(Number.perfect(i))
				temp[2]++;
		}
		return temp;
	}

}
