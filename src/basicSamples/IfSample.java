package basicSamples;

public class IfSample {

	public static void main(String[] args) {
		int number=10;
		if (number<10) {
			System.out.println("the number id negative");
		}
		System.out.println("Statement outside the block");
		String lan="java";
		if (lan=="java") {
			System.out.println("Best programming language");
		}
		int number2=0;
		int number3=10;
		if(number3>0) {
			System.out.println("The number is positive");
		}
		else if(number3<0) {
			System.out.println("The number is negative");
		}
		else {
			System.out.println("The number is zero");
		}
	}

}
