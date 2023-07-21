package preparation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatmap {
	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(23, 45, 67);
		List<Integer> l2 = Arrays.asList(12, 23, 34);
		List<Integer> l3 = Arrays.asList(10, 20, 30);
		List<Integer> l4 = Arrays.asList(11, 22, 33);

		List<List<Integer>> l = Arrays.asList(l1, l2, l3, l4);
		List<Integer> lo = l.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		lo.forEach(x -> System.out.println(x));

		List<String> f1 = Arrays.asList("selva", "anand", "rithu");
		List<String> f2 = Arrays.asList("varun", "logesh", "nisha");
		List<String> f3 = Arrays.asList("symla", "nandhini", "kundavai");

		List<List<String>> lo1 = Arrays.asList(f1, f2, f3);
		List<String> f = lo1.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		f.forEach(x -> System.out.println(x));
	}

}
