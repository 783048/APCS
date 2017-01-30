package whileLoopsLabs;

public class DigitCounter {
	public static void counter(int in){
		int num = in;
		int count = 0;
		while(num > 0){
			count++;
			num = num / 10;
		}
		if(count>1){
		System.out.println(in + " contains " + count + " digits");
		}
		else System.out.println(in + " contains " + count + " digit");
	}
}
