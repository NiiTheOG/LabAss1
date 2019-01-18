import java.util.Scanner;
/*
 * This program stores the length of a given String.
 */
public class lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The String is given by the user and stored in the input variable
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter a Phrase or word");
		String input=scanner.next();
		
		int strLength= input.length();
		System.out.println("The length of the String is " + strLength);
	}

}
