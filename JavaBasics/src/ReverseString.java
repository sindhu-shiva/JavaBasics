
public class ReverseString {

	public static void main(String[] args) {
		
		String input="KISHORE" ;
        String Output ="" ;	
		for (int i=input.length()-1;i>=0;i--)
		{
			//System.out.println(i);
			Output= Output +input.charAt(i);
			
		}
		System.out.println(Output);
	}
 
}
