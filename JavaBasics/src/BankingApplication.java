
public class BankingApplication extends BankAccount {
			

	BankingApplication(String CustomerName, int CustomerId) {
		super(CustomerName, CustomerId);
		
	}

	public static void main(String[] args) {
		BankAccount obj= new BankAccount("Sindhu",1234567);
		obj.display();
		

	}

}
