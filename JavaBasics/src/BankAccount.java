import java.util.Scanner;

public class BankAccount {
	int amount, balance, transaction;
	 String CustomerName;
	 int CustomerId;
	 Scanner sc;
	
	BankAccount(String CustomerName, int CustomerId)
	{
		
	this.CustomerName=CustomerName;
	this.CustomerId=CustomerId;
	}
	
	public void deposit(int amount)
	{
		if(amount!=0)
		{
			balance= balance+ amount;
			transaction= amount;
		}
		
		
			
	}
	
	public void withdrawal(int amount)
	{
		if(amount!=0)
		{
			balance= balance- amount;
			transaction= -amount;
		}

		
	}
	

	public void findtransactionamount()
	{
		if(transaction>0)
		{
			System.out.println("The deposited transaction value made is:"+transaction);
			
	}
		else
		{
			System.out.println("The withdrawn transaction  made is:"+Math.abs(transaction));
		}
}
	
	public void display()
	{
		
		System.out.println("Welcome to the banking application:");
		System.out.println("The account holder name is:"+ CustomerName);
		System.out.println("The account holder ID is:"+ CustomerId);
		System.out.println("\n");
		System.out.println("A: Check Balance");
		System.out.println("B: Deposit amount");
		System.out.println("C: Withdraw amount");
		System.out.println("D: Check Previous transaction amount");
		
		String option;
		Scanner sc= new Scanner(System.in);
		
		do
		{
		
			System.out.println("\n");
			System.out.println("Enter any option: A, B, C, D");
			option= sc.next();
			
			switch(option)
			{
			case"A": 
				if(balance <0)
				{
					System.out.println("Zero Balance");
				}
				else
					{
					System.out.println("The balance amount is="+balance);
					
			         System.out.println("\n");
			         break;
					}
			         
			case"B": 
			         System.out.println("Enter the amount to be deposited");
					 int depamount=sc.nextInt();      
					 deposit(depamount);
					 break;
					 
			case"C": 
	                 System.out.println("Enter the amount to be withdrawn");
			         int withdrawnamount=sc.nextInt();      
			         withdrawal(withdrawnamount);
			         break;	
			         
			case"D": findtransactionamount();
	                break;	     
	                
	         default: 
	        	     System.out.println("Invalid operation, please try again");      
			           break;
			}
			         
			}while(option!="E");
			 
		

}
}

