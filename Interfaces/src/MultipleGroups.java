import java.util.List;

public class MultipleGroups {

	private List<NumberGroup> groupList;
	
	public boolean contains(int num) {
		for(NumberGroup group : groupList) {	//enhanced for loop --> for(NameOfClass variable : NameOfListObject)
			if(group.contains(num))
				return true;
		}
		return false;
	}
}
