package basicSamples;
import java.text.NumberFormat;
public class DataTypesSamples {


	public static void main(String[] args) {
		double myDouble =3.4;
		float myFloat=3.4f;
		NumberFormat.getCurrencyInstance();
		double myDoubleScientific=3.445e2; //3.445*10^2
		System.out.println(myDouble);
		System.out.println(myFloat);
		System.out.println(myDoubleScientific);
		char letter = 'a';
		String str1="Java Programming";
		String str2= "Programiz";
		int irange=-4250000;
		System.out.println(irange);  // -4250000
		long lrange=-4233220000L;
		System.out.println(lrange);   //-42332200000
		byte range;
		range=124;
		byte range1=10;
		System.out.println(range);  //124
		short temperature;
		temperature=-200;
		System.out.println(temperature);  //-200
		
	}

}
