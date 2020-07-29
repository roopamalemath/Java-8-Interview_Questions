import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class returnPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("abca"); 
		
        // Search above pattern in "geeksforgeeks.org" 
        Matcher m = pattern.matcher("abcaabcabbabca"); 
  
        // Print starting and ending indexes of the pattern 
        // in text 
        while (m.find()) 
            System.out.println("Pattern found from " + m.start()); 
		

	}
}
