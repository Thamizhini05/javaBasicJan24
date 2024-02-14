package basicSamples;

import java.util.Scanner;

public class WhileLoopSampleJava {

	public static void main(String[] args) {
		int sum=0;// to find sum of positive numbers
		Scanner input =new Scanner(System.in); //create an object of scanner class
		System.out.println("Enter a number:"); // take integer input from the user
		int number=input.nextInt();
		while (number>=0) {
			sum+=number;
			System.out.println("enter a number");
			number=input.nextInt();
		}
		System.out.println("Enter a number");
		number=input.nextInt();
		System.out.println("sum =" + sum);
		input.close();
	}
}


