package ex3;

public class StringParser {
	
	public String fromArrayToString(String[] tabString,char lettre) {
		
		return String.join(String.valueOf(lettre),tabString);
	
	}
	
	public String[] fromStringToArray(String s,char lettre) {
		
		return s.split(String.valueOf(lettre));
		
	}
}
