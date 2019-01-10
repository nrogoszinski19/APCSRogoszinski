
public class arrays {

	public static void main(String[] args) {
		int[] list = new int[10];

		for(int i = 0; i<10; i++){
			list[i] = i+1;
			System.out.print(list[i] + " ");
		}
		
		System.out.println(getMax(list));
	}
	
	public static double getMax(int[] list) {
		int last = list[0];
		for(int i = 0; i<list.length; i++){
			if(last < list[i])
				last = list[i];
		}
		return last;

	}

}
