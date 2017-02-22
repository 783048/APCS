package arrayListLabs;

import java.util.*;

public class ArrayListFunHouseRunner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Integer Value : ");
		int x = scan.nextInt();
		
		System.out.println("Factors of "+ x + " are : " + ArrayListFunHouse.factor(x));

	}

}
