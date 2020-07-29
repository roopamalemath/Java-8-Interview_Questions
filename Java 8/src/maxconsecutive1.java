

class maxconsecutive1 { 
  //	1 - > true
  //	0 - > false
      
    static int getMaxLength(boolean arr[], int n) 
    { 
          
        int count = 0;  
        int result = 0;  
      
        for (int i = 0; i < n; i++) 
        { 
              
            // Reset count when 1 is found 
            if (arr[i] == true) 
                count = 0; 
      
            // If 0 is found, increment count 
            // and update result if count becomes 
            // more. 
            else
            { 
                count++;//increase count 
                result = Math.max(count, result); 
            } 
        } 
      
        return result; 
    } 
      
   public static void main(String[] args) 
    { 
    	// 1000110000100 given array can be represented as 
        boolean arr[] = {true, false, false, false,  
                         true, true, false, false, 
                           false, false, true, false, false}; 
        
                             
        int n = arr.length; 
          
        System.out.println(getMaxLength(arr, n)); 
    } 
} 