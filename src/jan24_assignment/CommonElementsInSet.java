package jan24_assignment;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class CommonElementsInSet {

	public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);
		        System.out.print("Enter elements for the first set ");
		        String inputSet1 = input.nextLine();
		        Set<String> set1 = createSet(inputSet1);
		        System.out.print("Enter elements for the second set ");
		        String inputSet2 = input.nextLine();
		        Set<String> set2 = createSet(inputSet2);
		        Set<String> commonElements = new HashSet<>(set1);
		        commonElements.retainAll(set2);
		        System.out.println("Set 1: " + set1);
		        System.out.println("Set 2: " + set2);
		        System.out.println("Common Elements: " + commonElements);
		    }
		    private static Set<String> createSet(String input) {
		        Set<String> set = new HashSet<>();
		        String[] elements = input.split(" ");
		        for (String element : elements) {
		            set.add(element);
		        }
		        return set;
		    }
		}


