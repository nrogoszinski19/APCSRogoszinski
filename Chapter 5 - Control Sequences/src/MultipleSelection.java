
public class MultipleSelection {

	public static void main(String[] args) {
		
		int grade = 85;
		if(grade >= 90) {
			System.out.println("My grade is an A");
		}
		else if(grade < 90 && grade >= 80) {
			System.out.println("My grade is a B");
		}
		else if(grade < 80 && grade>= 70) {
			System.out.println("My grade is a C");
		}
		else {
			System.out.println("My grade is an F");
		}

	}

}
