import java.util.Arrays;

public class SecondLargest {
	
	public static int secondLargest(int a[]) {
		int temp;
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]>a[j]) {
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
		Arrays.sort(a);
		return a[a.length-2];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55}; 
		System.out.println(secondLargest(a));
		System.out.println(secondLargest(b));

	}

}
