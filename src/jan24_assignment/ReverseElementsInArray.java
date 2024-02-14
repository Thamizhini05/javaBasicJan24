package jan24_assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ReverseElementsInArray {
	public static void main(String[] args) {
		        
		        Scanner input = new Scanner(System.in);
		        System.out.print("Enter elements for the ArrayList: ");
		        String input1 = input.nextLine();
		        ArrayList<String> arrayList = new ArrayList<>();
		        String[] elements = input1.split(" ");
		        Collections.addAll(arrayList, elements);//add elements from the array list
		        Collections.reverse(arrayList);
		        System.out.println("Reversed ArrayList: " + arrayList);
		    }
		}
