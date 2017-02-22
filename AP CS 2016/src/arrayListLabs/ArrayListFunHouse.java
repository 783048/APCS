package arrayListLabs;

import java.util.ArrayList;

public class ArrayListFunHouse {
	public static ArrayList<Integer> factor(int num){
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i = 1; i <= (num / 2); i++)
			if(num % i == 0)
				array.add(i);
		return array;
	}

}
