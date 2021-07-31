
public class InterfaceMain {

	public static void main(String[] args) {
	
		Interface12 obj= new Interface1();//obj of iterface1 referening to the reference variable of interface12
		obj.end1();
		obj.start1();
		
		Interface11 obj1= new Interface1();//obj of iterface1 referening to the reference variable of interface11
		obj1.end();
		obj1.start();
		
		Interface1 obj2= new Interface1();// obj of implemented class
		obj2.end();
		obj2.end1();
		obj2.start();
		obj2.start1();
		obj2.check1();

	}

}
