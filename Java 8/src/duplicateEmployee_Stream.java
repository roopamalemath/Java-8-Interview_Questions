import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class duplicateEmployee_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> li = new ArrayList<>();
		li.add(new Employee(1, "Roopa", "Davangere"));
		li.add(new Employee(2, "Malemath", "Bangalore"));
		li.add(new Employee(1, "Roopa", "Davangere"));
		System.out.println("before removing duplicates");
		for (Employee e : li) {
			System.out.println(e.getName());
		}

		System.out.println("after removing duplicates");
		List<Employee> list = li.stream().distinct().collect(Collectors.toList());
		for (Employee e : list) {

			System.out.println(e.getName());
		}

	}

}
