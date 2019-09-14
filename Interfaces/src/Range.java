
public class Range implements NumberGroup {
	
	int min;
	int max;
	
	public Range(int tempmin, int tempmax) {
		min = tempmin;
		max = tempmax;
	}

	public boolean contains(int num) {
		if(num>=min && num<=max)
			return true;
		else
			return false;
		}

}
