package jan23_assignment;
import java.util.Scanner;
public class IntegerRange {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number between 0 to 1000");
		int number=input.nextInt();
		if ((number<0)|| (number>1000)|| (number==0)) {
			System.out.println("Enter the number from the range limit!..");
		}
		else {
			int sum=0;
			int storeNumber=number;
			while(number!=0) {
				sum=sum+number%10;
				number=number/10;
		
			}
			System.out.println("The sum of the number of " + storeNumber +" is "+sum);
		}
	}
	
}
