package basicSamples;

public class OperatorsSample {

	public static void main(String[] args) {
		int a=12,b=5;
		System.out.println("a + b="+ (a+b));//addition operator
		System.out.println("a - b =" + (a-b));//subtract operator
		System.out.println("a * b =" + (a*b));//multiplication operator
		System.out.println("a / b =" + (a/b));//division operator
		System.out.println("a % b =" + (a%b));//modulo operator
		int ac=4;
		int var;
		var=ac;// assign value using =
		System.out.println("var using =:" + var);
		var+=ac;// assign value using =+
		System.out.println("var using +=:" + var);
		var *=ac;// assign value using =*
		System.out.println("var using =:" + var);
	}

}
