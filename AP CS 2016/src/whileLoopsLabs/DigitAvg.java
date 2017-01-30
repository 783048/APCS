package whileLoopsLabs;

public class DigitAvg {
	public static void avg(int in){
		int num = in;
		int sum = 0;
		int count = 0;
		while(num > 0){
			sum = sum + num%10;
			num = num / 10;
			count++;
		}
		
		System.out.println((sum / count) + " is the sum of the digits of " + in);
	}
}