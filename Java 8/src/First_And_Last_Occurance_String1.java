

public class First_And_Last_Occurance_String1 {
		
		public static int findOccurance(String s) {
			String guess = "c";
			//System.out.println(s.indexOf('c'));
			int index = s.indexOf(guess);
			//System.out.println(index);
			while (index >= 0) {
			    System.out.print(index+" ");
			    index = s.indexOf(guess, index + 1);
			   
			}
			return index;
		}
		
		// TODO Auto-generated method stub
		
		public static void main(String[] args) {
			String s="abcdabacdfe";
			findOccurance(s);
		}

}
