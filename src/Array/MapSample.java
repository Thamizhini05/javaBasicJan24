package Array;

import java.util.HashMap;

public class MapSample {

	public static void main(String[] args) {
		//create a hashmap
		HashMap<Integer,String>lan=new HashMap<>();
		lan.put(1,"java");
		lan.put(2, "Python");
		lan.put(2, "JavaScript");
		System.out.println("HashMap:" +lan);
		//get() method to get the value
		String value =lan.get(1);
		System.out.println("Value at Index 1:"+ value);
		//using keyset
		System.out.println("Keys:"+ lan.keySet());
		//return set view of values
		//using values
		System.out.println("values:"+lan.values());
		//return set view of keys/value pairs
		//using entrySet()
		System.out.println("Key/Value Mapping:"+lan.entrySet());
		//Remove Elements from the map
		String valueRem=lan.remove("two");
		System.out.println("Removed value:"+ valueRem);
	}

}
