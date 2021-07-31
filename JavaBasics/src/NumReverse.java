import java.util.Scanner;

public class NumReverse {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
	  
	   System.out.println("Enter 1 number");
	   int A= sc.nextInt();
	   int rev= 0;
	   while(A!=0)
	   {
		   rev =(rev*10) +  (A%10);
		   A=A /10;
	   
	   }
	   System.out.println(rev);
	   
	   }
	}


