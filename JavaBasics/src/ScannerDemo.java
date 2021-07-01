import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter your \" name\" please");
		String a= sc.nextLine();
		
		System.out.println(" Enter your mother's \" name\" please");
		String b= sc.nextLine();
		
		System.out.println(" Enter your father's \" name\" please");
		String c= sc.nextLine();
		
		System.out.println("Your Family members are: ");
		System.out.println("You are "+a);
		System.out.println(b);
		System.out.println(c);
		

	}

}
