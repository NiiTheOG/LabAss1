import java.util.Scanner;

public class lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		String input= scanner.nextLine();
		
		//The loop reverses what the user inputs but puts the last word in the first position
		String reverse=" ";
		for (int i=input.length()-1;i>=0;i--) {
			reverse=reverse+input.charAt(i);
		}
		
		String [] arrStr= reverse.split(" ");
		
		//This loop reverses what has already being reversed again so the first word comes to the first position again.
		String as=" ";
		for (int i=0;i<=arrStr.length-1;i++) {
			as= arrStr[i]+" "+as;
		}
		
		System.out.println(as);
	}

}
