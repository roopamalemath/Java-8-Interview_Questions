
public class practicePrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdabacdfecc";
		String guess="a";
		int index=s.indexOf(guess);
		while(index>=0) {
			System.out.println(index);
			index=s.indexOf(guess, index+1);
		}

	}

}
