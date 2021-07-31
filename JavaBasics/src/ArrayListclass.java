import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListclass {

	public static void main(String[] args) {
		
		ArrayList<String> ar1= new ArrayList<String>();
		
		ar1.add("sindhu");
		ar1.add("ks");
		
		ArrayList<String> ar2= new ArrayList<String>();
		
		ar2.add("neo");
		ar2.add("inevitable");
		ar2.add("ks");
		
		//ar1.addAll(ar2);
		//ar1.removeAll(ar2);
		ar1.retainAll(ar2);
		
		System.out.println(ar1.size());
		
		for (int i=0;i<ar1.size();i++)
		{
			
			System.out.println(ar1.get(i));
		}
		//defining the objects
		Employee e1= new Employee(52101780, "sindhu", "ks");
		Employee e2= new Employee(52111, "neo", "inevitable");
		
		
		//array list to store employee object
		
		ArrayList<Employee> e= new ArrayList<Employee>();
		e.add(e1);
		
		e.add(e2);
		
		//iterator to iterate the values:Here “e” is any Collection object. iter is of type Iterator interface and refers to “e”.
		Iterator<Employee> iter =e.iterator();
		while(iter.hasNext())
		{
			 Employee emp= iter.next();
			 System.out.println(emp.name);
			 System.out.println(emp.surname);
			 System.out.println(emp.winid);
		}
	}

}
