package assignment_5;
import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int result = 0;
		while(result<100) {
			System.out.println("Please enter a number");
			i = scan.nextInt();
			result = 10*i;
			if(result>=100) {
				System.out.println("well done");
			}
			
			
			
	}
}
}
