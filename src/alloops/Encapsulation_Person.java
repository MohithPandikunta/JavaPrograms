package alloops;

public class Encapsulation_Person {
	private String name;
	private int age;
	
	public Encapsulation_Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public void result() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	

}
