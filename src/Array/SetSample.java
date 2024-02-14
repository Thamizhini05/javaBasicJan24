package Array;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
public class SetSample {

	public static void main(String[] args) {

			HashSet<Integer> evenNumber=new HashSet<>();
			//using add() method
			evenNumber.add(4);
			evenNumber.add(2);
			evenNumber.add(8);
			evenNumber.add(6);
			System.out.println("HashSet:" + evenNumber);
			HashSet<Integer> numbers=new HashSet<>();
			//using assAll() method
			numbers.addAll(evenNumber);
			numbers.add(5);
			System.out.println("New HashSet: "+ numbers);
			//calling iterator() method
			Iterator<Integer> iterate=numbers.iterator();
			System.out.println("Hashset using Iterator:");
			//accessing elements
			while(iterate.hasNext()) {
				System.out.println(iterate.next());
				System.out.println(", ");
			}
			//using rempve() method
			boolean value1=numbers.remove(5);
			System.out.println("Is 5 removed?"+ value1);
			boolean value2=numbers.removeAll(numbers);
			System.out.println("Are all elements removed? "+value2);
			//to add string values
			HashSet<String> empList1=new HashSet<>();
			empList1.add("John");
			empList1.add("Peter");
			empList1.add("Andrew");
			System.out.println("List of Employees..."+empList1);
			TreeSet<String>EmpList1=new TreeSet<>();
			empList1.add("John");
			empList1.add("Peter");
			empList1.add("Andrew");
			System.out.println("List of Employees..."+empList1);
		}
}
