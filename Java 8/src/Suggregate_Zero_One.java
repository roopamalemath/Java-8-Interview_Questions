import java.util.Arrays;

public class Suggregate_Zero_One {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 1, 0, 1, 1, 0, 1 };
		int sum = 0;
	    for (int i = 0; i < arr.length; i++)
	        sum = sum + arr[i];
        Arrays.fill(arr, arr.length - sum, arr.length-1, 1);  // 3, 7, 1
	    Arrays.fill(arr, 0, arr.length - sum, 0);           // 0, 3, 0 
	    System.out.println(Arrays.toString(arr));

  
	}

}
