
public class charCount {

	static int ASCII_SIZE = 254;

	static char maxCount(String s) {
		int[] count = new int[ASCII_SIZE];
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i)]++;
			//System.out.println(count[s.charAt(i)]++);

		}
			int max = -1;
			char result = ' ';

			for (int i = 0; i < s.length(); i++) {
				if (max < count[s.charAt(i)]) {
					max = count[s.charAt(i)];
					result = s.charAt(i);
				}
			}
			return result;
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "i am from india";
		System.out.println(maxCount(s));

	}

}
