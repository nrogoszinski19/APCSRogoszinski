
public class TextLab03_80points {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("TextLab02, 80 Point Version\n");
		
		int start = 10000;
		
		System.out.println("Starting seconds:\t" + start);
		
		int hours = start/3600;
		
		System.out.println("Hours:\t\t\t" + hours);
		
		int remainder = start%3600;
		int minutes = remainder/60;
		
		System.out.println("Minutes:\t\t" + minutes);
		
		int remainder2 = remainder%60;
		
		System.out.println("Seconds:\t\t" + remainder2);
	}

}
