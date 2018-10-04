
public class TextLab03_100points {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("TextLab02, 80 Point Version\n");
		
		int start = 10000123;
		
		System.out.println("Starting milli-seconds:\t" + start);
		
		int hours = start/3600000;
		
		System.out.println("Hours:\t\t\t" + hours);
		
		int remainder = start%3600000;
		int minutes = remainder/60000;
		
		System.out.println("Minutes:\t\t" + minutes);
		
		int remainder2 = remainder%60000;
		int seconds = remainder2/1000;
		
		System.out.println("Seconds:\t\t" + seconds);
		
		int milliseconds = remainder2%1000;
		
		System.out.println("Milli Seconds:\t\t" + milliseconds);
	}

}
