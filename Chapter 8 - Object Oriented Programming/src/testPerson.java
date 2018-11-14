
public class testPerson {

	public static void main(String[] args) {
		
		Person defaultPerson = new Person();
		String n1 = defaultPerson.firstName;
		String n2 = defaultPerson.lastName;
		System.out.println(n1 + " " + n2);
		
		Person Evan = new Person("Evan", "Spector", 17);
		System.out.println(Evan.firstName + " " + Evan.lastName + " " + Evan.age);
		
		Student Noa = new Student("Noa", "Rogoszinski", 17);
		System.out.println(Noa.firstName + " " + Noa.lastName + " " + Noa.age + " " + Noa.id + " " + Noa.gpa);

	}
	

}
