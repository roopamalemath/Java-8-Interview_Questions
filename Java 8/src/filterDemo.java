import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	List<String> names=Arrays.asList("Roopa","V","Malemath");
	List l1=names.stream().filter(s->s.contains("Roopa")).collect(Collectors.toList());
	System.out.println(l1);
	}

}
