// Encapsulation to binding the data with methods
class Student
{
	private int rollno;
	private String name;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Getter and setter
	
}

public class Encapsulation {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setRollno(25);
		System.out.println(s1.getRollno());
		s1.setName("AShok");
		System.out.println(s1.getName());

	}

}
