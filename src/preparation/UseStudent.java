package preparation;

import java.util.HashMap;

public class UseStudent {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("selva",101,"male",17);
		Student s2 = new Student("janvi",102,"female",16);
		Student s3 = new Student("rithu",103,"male",18);
		Student s4 = new Student("selva",101,"male",17);
		
		HashMap<Integer,Student> list = new HashMap<>();
		
		list.put(s1.getRollNumber(), s1);
		list.put(s2.getRollNumber(), s2);
		list.put(s3.getRollNumber(), s3);
		list.put(s4.getRollNumber(), s4);
		
		System.out.println(list);
		
		System.out.println(s1.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s1.equals(s4));
		list.values().forEach(x->System.out.println(x));
		list.keySet().forEach(x->System.out.println(x));
		
		
		
		
	}

}
