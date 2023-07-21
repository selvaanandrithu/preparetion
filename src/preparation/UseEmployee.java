package preparation;

import java.util.HashMap;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("Nisha", 101, 15, "Trainer");
		Employee e2 = new Employee("madhan", 102, 12, "Student");
		Employee e3 = new Employee("valli", 101, 30, "Trainer");
		// Employee e3 = new Employee("valli",1001,30,"Trainer");
		Employee e4 = new Employee("feroz", 105, 15, "Trainer");

		HashMap<Integer, Employee> emp = new HashMap<>();
		emp.put(e1.getId(), e1);
		emp.put(e2.getId(), e2);
		emp.put(e3.getId(), e3);
		emp.put(e4.getId(), e4);

		//emp.values().forEach(x -> System.out.println(x));
		
		System.out.println(e1.equals(e3));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());

	}

}
