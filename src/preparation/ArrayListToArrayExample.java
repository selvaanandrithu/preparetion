  package preparation;
  
  

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArrayExample {
	public static void main(String[] args) {
		// Create an ArrayList
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Hello");
		arrayList.add("World");
		arrayList.add("Java");
//       1st way
//		String[] array = arrayList.toArray(new String[arrayList.size()]);
//		System.out.println(Arrays.toString(array));

//        2nd way
		String[] array = arrayList.toArray(new String[0]);
		for (String x : array) {
			System.out.println(x);
		}

	}
}
