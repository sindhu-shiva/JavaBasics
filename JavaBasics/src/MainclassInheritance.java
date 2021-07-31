
public class MainclassInheritance {

	public static void main(String[] args) {
		InheritanceChild obj= new InheritanceChild();
		obj.start();
		Inheritance car= new InheritanceChild();
	    car.start();// always priority to overridden methods of child class
		car.stop();
		//car.startagain();// error

	}

}

