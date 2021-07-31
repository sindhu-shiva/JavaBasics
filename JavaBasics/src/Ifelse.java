import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter value of a ");
		int a= sc.nextInt();
		
		System.out.println("Enter value of b");
		int b= sc.nextInt();
		
		System.out.println("Enter value of c");
		int c= sc.nextInt();
		
		
		
		if(a>b && a>c)
			System.out.println("Ais greater");
		
		else
         if(b>a && b>c)
        	 System.out.println(" B is greater");
         else
        	 System.out.println(" c is greater");
		

	}

}
