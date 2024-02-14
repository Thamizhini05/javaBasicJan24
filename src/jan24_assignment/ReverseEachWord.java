package jan24_assignment;
import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String input1= input.nextLine();
        String[] words = input1.split(" ");
        String reversedString = reverseWords(words);
        
        System.out.println("The Original String: " + input1);
        System.out.println("The Reversed String: " + reversedString);
    }
    private static String reverseWords(String[] words) {
        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }        
        return String.join(" ", words);
    }
}
