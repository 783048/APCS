package forLoops;

import java.util.Scanner;

public class BoxWordRunner {
	public static void main ( String[] args )
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input word: ");
		String word = scan.nextLine();
		
		BoxWord.box(word);
		
	}

}
