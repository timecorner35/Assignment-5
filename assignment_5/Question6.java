package assignment_5;

public class Question6 {

	public static void main(String[] args) {
		int n1=0,n2=1,n3,i,n=20;    
		 System.out.print(n1+" "+n2);  
		    
		 for(i=3;i<=n;i++)
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
		}

	}

