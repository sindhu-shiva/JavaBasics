import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListprogram {

	public static void main(String[] args) {
		
		LinkedList <String> li= new LinkedList<String>();
		li.add("sindhu");
		li.add("janu");
		li.add("shijin");
		li.add("shyama");

		
		System.out.println(li);
		System.out.println(li.get(0));
		//System.out.println(li.get(6));
		
		/*Iterator<String> It =li.iterator();
		
		while(It.hasNext())
			System.out.println(It.next());*/
		
		for(String each: li)
		{
			System.out.println(each);
		}
	}

}
