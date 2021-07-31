
public class ObjectArray {

	public static void main(String[] args) {
		Object ob[]= new Object[5];
		
		ob[0]="sindhu";
		ob[1]=2.987654;
		ob[2]= 1/1/1990;
		ob[3]='a';
		ob[4]=true;
		
System.out.println(ob.length);

for (int i=0;i<ob.length;i++)
{
	System.out.println(ob[i]);
}
				

	}

}
