import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class reduceDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number = Arrays.asList(2,3,4,5);
		int even=number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
		System.out.println(even);
	}

}
