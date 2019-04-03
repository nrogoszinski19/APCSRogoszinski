
public class HiddenWord {
	String word;

	public HiddenWord(String w) {
		word = w;
	}
	
	public String getHint(String guess) {
		String hint = " ";
		for(int i = 0; i<guess.length(); i++) {
			if(guess.substring(i,i+1).equals(word.substring(i,i+1)))
				hint += guess.substring(i,i+1);
			else if(guess.substring(i,i+1).equals(word.substring(0,word.length())))
				hint += "+";
			else
				hint += "*";
		}
		return hint;
		
	}

}
