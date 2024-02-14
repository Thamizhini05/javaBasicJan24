package jan23_assignment;
import java.util.Scanner;
public class SumAndAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 nos:");
		
		int sum=0;
		double average;
		for(int i=1;i<=5;i++) {
			System.out.println("Enter number "+ i+":");
			int number=input.nextInt();
			sum=sum+number;
		}
		average=sum/5;
		System.out.println("The sum of the numbers is:"+ sum);
		System.out.println("The average of the numbers is:"+average);
	}

}
