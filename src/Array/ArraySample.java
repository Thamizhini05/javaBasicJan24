package Array;//array can't be changed once it is declared , the size is fixed

public class ArraySample {

	public static void main(String[] args) {
		String strNames[]= {"pinky","Wicky","John"};
		//declare and initialize the array
		int[] age= {12,4,5,2,5};//array index first with zero
		//access each array elements
		System.out.println("Accesing Elements in array:");
		System.out.println("First Element: " + age[0]);
		System.out.println("Second Element: " + age[1]);
		System.out.println("Third Element: " + age[2]);
		System.out.println("Fourth Element: " + age[3]);
		System.out.println("Fifth Element: " + age[4]);
		System.out.println("Using for Loop:");
		//loop through the array
		//using for loop
		for (int i=0;i<age.length;i++) {
			System.out.println(age[1]);
		}
		//loop through the array
		//using for loop
		System.out.println("Using for-each Loop:");
		for (int a:age) {
			System.out.println(age);
		}
		//access all elements using for each loop
		int[] numbers= {2,-9,0,5,12,-25,22,9,8,12};
		int sum=0;
		Double average;
		//add each element in sum
		for(int number:numbers) {
			sum+=number;
		}
		//get the total number of elements
		int arrayLength=numbers.length;
		//calculate the average
		//convert the average from int to double
		average=((double)sum/(double)arrayLength);
		System.out.println("Sum=" +sum);
		System.out.println("Average=" +average);
		//create a 2d array
		int[][] a= {
				{1,2,3},
				{4,5,6,9},
				{7},
		};
		//calculate the length of each row
		System.out.println("Length of row 1:" +a[0].length);
		System.out.println("Length of row 2:" +a[1].length);
		System.out.println("Length of row 3:" +a[2].length);
	}

}
