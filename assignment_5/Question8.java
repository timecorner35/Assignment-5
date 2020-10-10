package assignment_5;
import java.util.Scanner;
public class Question8 {

	public static void main(String[] args) {
		int upperBond ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose Upper Limit");
		upperBond = scan.nextInt();
				int i = 1;
				int sum = 0;
			
				while(i<=upperBond) {
				
				sum=sum+i;
				i++;
				}	
					System.out.println(sum);
				}

	}


