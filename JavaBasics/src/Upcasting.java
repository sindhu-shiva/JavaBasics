class Mobile{
	
	public void calling()
	{
		System.out.println(" Mobile is calling");
	}
}

class Samsung extends Mobile{
	
	public void calling()//overridden
	{
	System.out.println("samsung is calling");	
	}
	
	public void checking()
	{
		System.out.println("samsung is checking");
	}
}
public class Upcasting {

	public static void main(String[] args) {
		/*
		 Samsung S= new Samsung();
		 Mobile M= (Mobile)S;
		 */
		Mobile M= new Samsung();
		M.calling();
		//M.checking();
		// TODO Auto-generated method stub

	}

}
