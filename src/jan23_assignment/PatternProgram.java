package jan23_assignment;
import java.util.Scanner;
public class PatternProgram {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int rows=input.nextInt();
		for (int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
