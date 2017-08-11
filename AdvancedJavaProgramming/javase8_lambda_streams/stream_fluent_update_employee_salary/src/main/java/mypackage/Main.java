package mypackage;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Sang", 20000, "USA"));
		list.add(new Employee(2, "Jon", 30000, "USA"));
		list.add(new Employee(3, "Mary", 40000, "Mexico"));
		list.add(new Employee(4, "Leo", 50000, "USA"));
		list.add(new Employee(4, "Bill", 60000, "Korea"));

		System.out.println("---- Non-stream (External iteration) operation ----");
		for (Employee e : list) {
			if (e.getSalary() < 40000 && e.getCountry() == "USA") {
				e.setSalary(e.getSalary() * 110 / 100);
			}
		}
		for (Employee e : list) {
			System.out.println(e.getSalary());
		}

		list = new ArrayList<>();
		list.add(new Employee(1, "Sang", 20000, "USA"));
		list.add(new Employee(2, "Jon", 30000, "USA"));
		list.add(new Employee(3, "Mary", 40000, "Mexico"));
		list.add(new Employee(4, "Leo", 50000, "USA"));
		list.add(new Employee(4, "Bill", 60000, "Korea"));

		System.out.println("---- Stream (Internal iteration) operation ----");
		list.stream()
				.filter(e -> e.getSalary() < 40000 && e.getCountry() == "USA")
				.forEach(e -> e.setSalary((e.getSalary() * 110) / 100));

		list.forEach(e -> System.out.println(e.getSalary()));

		// <For your own exercise>
		// - Create a stream from the list and filter only the people 
		//   the length of whose name is 4 characters and whose salary is less
		//   than 50000 and then raise their salary by 100%
		list = new ArrayList<>();
		list.add(new Employee(1, "Sang", 20000, "USA"));
		list.add(new Employee(2, "Jon", 30000, "USA"));
		list.add(new Employee(3, "Mary", 40000, "Mexico"));
		list.add(new Employee(4, "Leo", 50000, "USA"));
		list.add(new Employee(4, "Bill", 60000, "Korea"));
		
		System.out.println("---- Practice Stream (Internal iteration) operation ----");
		list.stream()
			.filter(e -> e.getName().length() == 4 && e.getSalary() < 50000)
			.forEach(e -> e.setSalary(e.getSalary()*2));
		
		list.forEach(e -> System.out.println(e.getSalary()));
	}

}
