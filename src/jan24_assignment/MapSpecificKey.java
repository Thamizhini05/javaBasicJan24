package jan24_assignment;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapSpecificKey {
	public static void main(String[] args) {
	
		        Map<String, Integer> sampleMap = new HashMap<>();
		        sampleMap.put("tamil", 20);
		        sampleMap.put("Aishma", 21);
		        sampleMap.put("Sruthi", 22);
		        Scanner input1 = new Scanner(System.in);
		        System.out.print("Enter a name to check if it exists in the map: ");
		        String inputKey = input1.nextLine();
		        if (sampleMap.containsKey(inputKey)) {   //check if the map contains any specific key
		            int value = sampleMap.get(inputKey);
		            System.out.println("Value for key '" + inputKey + "': " + value);//display the key
		        } else {
		            System.out.println("Key" + inputKey + " not found in the map.");
		        }
		    }
		}
