
public class Constructor {
	
	Constructor(int a)
	{
		System.out.println("learning");
	}
	
	Constructor(int a, int b)
	{
		this(8);
		System.out.println("learning again");
		
	}
	
	Constructor(int a, int d, double v)
	{
		this(2,4);
		System.out.println("learning last");
	}
	

	public static void main(String[] args) {
		
		new Constructor(2,6,2.9);
		
		// TODO Auto-generated method stub

	}

}
