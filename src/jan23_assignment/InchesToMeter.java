package jan23_assignment;
import java.util.Scanner;
public class InchesToMeter {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Inche");
		double inche=input.nextDouble();
		double meter=inche*0.0254;//(1 inches =0.0254)
		System.out.println("Measurement in Meter is "+ meter);
	}

}
//meter to inches=(1 meter = 39.37 inches)