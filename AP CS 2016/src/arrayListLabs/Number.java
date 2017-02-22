package arrayListLabs;

import java.util.ArrayList;

public class Number {
	public static boolean evenOdd(int num){
		if(num%2 == 0)
			return true;
		return false;
	}
	public static boolean perfect(int num){
		ArrayList<Integer> array = new ArrayList<Integer>();
		int sum = 0;
		for(int i = 1; i <= num / 2 + 1; i++)
			if(num % i == 0)
				array.add(i);
		for(int i = 0; i < array.size(); i++){
			sum = sum + array.get(i);
	}
		if(sum == num)
			return true;
		return false;
	}

}
