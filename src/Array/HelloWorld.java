package Array;

public class HelloWorld {
	int i;
	public static void main(String[] args) {
		System.out.println("Hello Welcome....");
		HelloWorld obj=new HelloWorld();
		System.out.println("value of i "+obj.i);
		System.out.println(obj.addition(34,78));
		System.out.println(HelloWorld.addition(54,88));
	}
	public static int addition(int num1,int num2) {
		int sum=num1+num2;
		return sum;
	}

}


