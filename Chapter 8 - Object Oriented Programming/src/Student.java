//create a Student that inherits the properties of a Person

public class Student extends Person{
	int id;
	double gpa;
	
	public Student(){
		super(firstName, lastName, age);
		id = 12345;
		gpa = 0.0;
	}
	
	public Student(String first, String last, int age){
		super(first, last, age);
	}
}
