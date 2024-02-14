package jan23_assignment;
import java.util.Scanner;
public class FahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter temperature in fahrenheit ");
		double fahrenheit=input.nextDouble();
		double celsius=(fahrenheit-32)*5/9; //  celsius formula
		System.out.println("The temperature in Celsius:" + celsius);

	}

}
//celsius=(fahrenheit-32)*5/9
//fahrenheit=(celsius * 9/5) + 32;