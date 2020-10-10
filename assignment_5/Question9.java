package assignment_5;
import java.util.Scanner;
public class Question9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int endNum = scan.nextInt();
		int number = 1;
		while(number<=endNum) {
			if(number==endNum&&number%2==1) {System.out.print(number);
			break;
			}	
			
			if(number==(endNum-1)&&number%2==1) {System.out.print(number);
			break;
			}
		
			if(number%2==1) {
			System.out.print(number+",");
			
			}
			number++;
		}
		
		
		
		
		
		
		
		
	}

}
