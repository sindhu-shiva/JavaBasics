
public class Encapsulation {
	
	private int rollno;
	private String name;
	

	public static void main(String[] args) {
		
		Encapsulation gs= new Encapsulation();
		gs.setRollno(67);
		gs.setname("sindhu");
		
		System.out.println(gs.getRollno());
		System.out.println(gs.getname());
		
	}

	
	public void setRollno(int rollno) {
		this.rollno=rollno;
	}
	
	public int getRollno() {
		return rollno;
	}
	
	
	public void setname(String name) {
		this.name=name;
	}
	
	public String getname() {
		return name;
	}
	
	
}

