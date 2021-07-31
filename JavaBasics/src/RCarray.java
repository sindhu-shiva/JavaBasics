
public class RCarray {

	public static void main(String[] args) {
		Object ob [][]= new Object[3][5];
		
		System.out.println(ob.length);
		System.out.println(ob[0].length);
		
		ob[0][0]="sindhu";
		ob[0][1]='a';
		ob[0][2]=2.88;
		
		ob[1][0]="sindhu";
		ob[1][1]="a";
		ob[1][2]=1/11/19;
		
		ob[2][0]="sindhu";
		ob[2][1]='a';
		ob[2][2]=2.88;
		
		for (int i=0;i<ob.length;i++)
		{
			for (int j=0;j<ob[0].length;j++)
			{
				System.out.println(ob[i][j]);
			}
			}
		}
		

}

