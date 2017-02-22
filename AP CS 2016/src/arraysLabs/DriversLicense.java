package arraysLabs;

public class DriversLicense {
	//>>>>>>>>>>>>>>>>>>>>>>>A, D, A, A, C, A, B, A, C, D, B, C, D, A, D, C, C, B, D, A
	static char[] answers = {65,68,65,65,67,65,66,65,67,68,66,67,68,65,68,67,67,66,68,65};
	static int correct = 0;
	static int incorrect = 0;
	public static boolean pass(char[] array){
		for(int i = 0; i < array.length; i++)
			if(answers[i] == array[i])
				correct++;
	if(correct>=15)
		return true;
	else return false;
	}
	public static int totalCorrect(char[] array){
		return correct;
	}
	public static int totalIncorrect(char[] array){
		incorrect = 20 - correct;
		return incorrect;
	}
	public static int[] questionsMissed(char[] array){
		int miss = 0;
		int[] temp = new int[incorrect];
		for(int i = 0; i < array.length; i++){
			if(array[i] != answers[i]){
				temp[miss] = i+1;
				miss++;
			}
		}
		return temp;
	}
}
