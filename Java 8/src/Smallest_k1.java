
import java.util.Arrays;

class Smallest_k1 { 
    // Function to return k'th smallest 
    // element in a given array 
    public static int kthSmallest(Integer[] arr, 
                                  int k) 
    { 
        // Sort the given array 
    	//3, 5, 7, 12, 17 
        Arrays.sort(arr); 
  
        return arr[k - 1]; 
    } 
  
    // driver program 
    public static void main(String[] args) 
    { 
        Integer arr[] = new Integer[] {7,10, 4, 3, 20, 15 }; 
        int k = 3; 
        System.out.print("K'th smallest element is " + kthSmallest(arr, k)); 
    } 
} 