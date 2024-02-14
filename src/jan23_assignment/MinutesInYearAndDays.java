package jan23_assignment;
import java.util.Scanner;
public class MinutesInYearAndDays {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter minutes:");
		long min=input.nextLong();
		long mininday=24*60;
		long mininyear=365*mininday;
		long year=min/mininyear;
		long remmin=min%mininyear;
		long days=remmin/mininday;
		System.out.println(min +" is equal to "+  year+" year and "+ days +" days");
	}

}
