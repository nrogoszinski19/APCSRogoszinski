import java.util.Scanner;

public class Password {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Create a username: ");
		String user = input.nextLine();
		
		System.out.print("Create a password: ");
		String pw = input.nextLine();
		
		System.out.print("Input your username: ");
		String user2 = input.nextLine();
		
		System.out.print("Input your password: ");
		String pw2 = input.nextLine();
		
		if(user.equals(user2) && pw.equals(pw2))
			System.out.println("You're in!");
		else if(user.equals(user2))
			System.out.println("Your password is incorrect.");
		else if(pw.equals(pw2))
			System.out.println("Your username is incorrect.");
		else
			System.out.println("Both your username and password are incorrect.");
		
	}

}
