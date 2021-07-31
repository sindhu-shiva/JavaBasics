
public class Interface1 implements Interface11, Interface12 {

	

@Override
public void start1() {
	System.out.println("start for iterface2");
	
}

@Override
public void end1() {
	System.out.println("end for iterface2");
	
}

public void check1()
{
	System.out.println("checking something");
}

@Override
public void start() {
	System.out.println("start for iterface1");
	
}

@Override
public void end() {
	System.out.println("start for iterface1");
}

}
