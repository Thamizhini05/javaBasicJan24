package basicSamples;

public class StringSample {

	public static void main(String[] args) {
		String first="Java is a object oriented programming";
		String second="Python";
		String third= "Language";
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println("Length of the string..." + first.length());
		String subStr=first.substring(10,16);
		System.out.println(subStr);
		String joinedString=first.concat(third);
		System.out.println("Joined string is..." + joinedString);
		String first1="Java programming";
		String second1="java programming";
		String third1= "Python programming";
		System.out.println("char at 2 is..."+ first.charAt(2));
		first.charAt(2);
		String[] words =first.split(" ");
		System.out.println("Each word...");
		for (int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
		boolean result1=first.equalsIgnoreCase(second);
		System.out.println("String first and second are equal: " +result1);
		if(first==second) {
			System.out.println("both strings are equal");
		}
		boolean result2=first.equals(third);
		System.out.println("strings first and third are equal:"+ result2);
		String example ="Hello";
		example=example.concat("Welcome");
		String newString=new String("Java program");
		String newStringOne=new String("Java program");
		if(newString==newStringOne) {
			System.out.println("Both are equal...");
		}
		System.out.println("Compare newstring and newstringone:" +newString.equals(newString));
		System.out.println("value of newString..." + newString.toUpperCase());
}
}
