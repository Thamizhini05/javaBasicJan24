package Array;
import java.util.ArrayList;
public class ArrayListSample {

	public static void main(String[] args) {
		//create ArrayList
		ArrayList<String> lan=new ArrayList<>();
		System.out.println("Size:.."+ lan.size());
		//add elements to ArrayList
		lan.add("Java");
		lan.add("Python");
		lan.add("Swift");
		lan.add("Typescript");
		System.out.println("ArrayList:"+lan);
		System.out.println("Size:.."+ lan.size());
		//to read element
		System.out.println("Get Element..."+lan.get(1));
		//to update Element
		lan.set(2,"Javascript");
		//to remove element
		lan.remove(3);
		System.out.println("After update ArrayList:"+ lan);}

}
