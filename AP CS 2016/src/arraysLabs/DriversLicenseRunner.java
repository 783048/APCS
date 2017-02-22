package arraysLabs;

import java.util.Arrays;
import java.util.Scanner;

public class DriversLicenseRunner {

	public static void main(String[] args) {
		char[] test = {65,68,65,65,67,65,66,65,67,68,66,67,68,65,68,67,67,66,68,65};
		//char[] test = {65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65};
		/*
		Scanner scan = new Scanner(System.in);
		char[] test = new char[20];
		for(int i = 0; i < 20; i++){
			System.out.println("Input your answer to " + (i+1) + " : ");
			test[i] = scan.next().toCharArray()
		}
		*/
		System.out.println("Have you passed? " + DriversLicense.pass(test));
		System.out.println("\nTotal Correct: " + DriversLicense.totalCorrect(test));
		System.out.println("Total Incorrect: " + DriversLicense.totalIncorrect(test));
		System.out.println("\nQuestions missed: " + Arrays.toString(DriversLicense.questionsMissed(test)));

	}

}
 