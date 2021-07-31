import java.util.Scanner;

public class BinaryNumberCheck {
	
	public static void main(String[] args) {
		
		int a=0, b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any valid numeric value ");
		
		int num=sc.nextInt();
		while(num>0)
		{
			
			int last =num % 10;
			if((last==0)||(last==1))
				
				 a++;
				 b++;
				num= num/10; 
				
		}
		if(a==b)
		   System.out.println("The value is binary");
		else
		    System.out.println("The value is not binary");
		
		
		
		

	}

}
