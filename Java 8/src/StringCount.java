
public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello World Hello I am saying Hello I am world";
		int count=1;
		String[] words=s.split(" ");
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equalsIgnoreCase(words[j])) {
					count++;
					words[j]="0";
				}				
			}
			if(words[i]!="0")
		         System.out.println(words[i]+"--"+count); //Printing the word along with count
		         count=1;
		}

	}

}
