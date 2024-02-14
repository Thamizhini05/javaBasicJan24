package basicSamples;

public class RelationalOpSample {

	public static void main(String[] args) {
		int a=7,b=11;//create variables
		System.out.println("a is  "+ a + "and b is " +b);//value of a and b
		System.out.println(a==b);//==operator (false)
		System.out.println(a!=b);// !=operator (true)
		System.out.println(a>b);// > operator(false)
		System.out.println(a<b);// < operator(true)
		System.out.println(a>=b);// >=operator(false)
		System.out.println(a<=b);//<=operator(true)
		System.out.println((5>3) &&(8>5)); //&&operator(true)
		System.out.println((5<3) &&(8<5)); //&&operator(false)
		System.out.println((5>3) &(8<5)); //&&operator(false)
		System.out.println((5<3) ||(8>5)); //|| operator(true)
		System.out.println((5>3) ||(8>5)); //|| operator(true)
		System.out.println((5>3) ||(8>5)); //|| operator(true)
		System.out.println((5<3) ||(8<5)); //|| operator(true)
		System.out.println(!(5==3)); // !  operator(true)
		System.out.println(!(5>3)); // !  operator(false)
	}
}
