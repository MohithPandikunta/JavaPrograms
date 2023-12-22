package alloops;

public class Inheritance_Student extends Encapsulation_Person {
	private String studentId;
	public Inheritance_Student(String name, int age, String studentId) {
		super(name, age);
		this.studentId = studentId;
	}
	@Override
	public void result() {
		super.result();
		System.out.println("StudentId: " + studentId);
	}
	

}
