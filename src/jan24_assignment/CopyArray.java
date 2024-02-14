package jan24_assignment;
import java.util.ArrayList;
import java.util.Scanner;
public class CopyArray {

	public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);
		        System.out.print("Enter elements for the original ArrayList (separated by spaces): ");
		        String input1 = input.nextLine();
		        ArrayList<String> originalArrayList = new ArrayList<>();//create new arraylist
		        String[] elements = input1.split(" ");// Split user input into elements 
		        for (String element : elements) {
		            originalArrayList.add(element);//add them to the original ArrayList
		        }
		        ArrayList<String> copiedArrayList = new ArrayList<>(originalArrayList);// new ArrayList to copy the elements
		        System.out.println("Original ArrayList: " + originalArrayList);
		        System.out.println("Copied ArrayList: " + copiedArrayList);
		    }
		}



