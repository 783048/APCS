package arrayListLabs;

import java.util.*;

public class NumberRunner {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,11,13,151,16,17,18,19,20));
		
		System.out.println("Integer Array : " + list);
		System.out.println("odd count = " + NumberAnalyzer.evenOdd(list)[0]);
		System.out.println("even count = " + NumberAnalyzer.evenOdd(list)[1]);
		System.out.println("perfect count = " + NumberAnalyzer.evenOdd(list)[2]);
		
	}

}
