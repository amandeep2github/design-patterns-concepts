package learn.design.design_patterns.decorator.ex1;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return String.format("First Name: %s; Last Name: %s; age: %d", firstName, lastName, age);
	}
	
	@Override
	public boolean equals(Object obj) {
		Person otherPerson = (Person)obj;
		return firstName.equals(otherPerson.getFirstName()) 
				&& lastName.equals(otherPerson.getLastName())
				&& age == otherPerson.getAge();
	}
	
}
