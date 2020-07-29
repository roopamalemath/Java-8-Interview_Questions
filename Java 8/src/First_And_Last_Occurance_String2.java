import java.util.ArrayList;

public class First_And_Last_Occurance_String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdabacdfe";
		String guess = "c";
		//System.out.println(s.indexOf('c'));
		int index = s.indexOf(guess);
		System.out.println(index);
		while (index >= 0) {
		    System.out.println(index);
		    index = s.indexOf(guess, index + 1);
		   
		}	}

}
