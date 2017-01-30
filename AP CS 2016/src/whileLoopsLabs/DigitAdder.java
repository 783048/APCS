package whileLoopsLabs;

public class DigitAdder {
	public static void counter(int in){
		int num = in;
		int sum = 0;
		while(num > 0){
			sum = sum + num%10;
			num = num / 10;
		}
		System.out.println(sum + " is the sum of the digits " + in);
	}
}