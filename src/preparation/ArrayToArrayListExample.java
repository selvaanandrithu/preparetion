package preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayListExample {
	public static void main(String[] args) {

		String[] array = { "apple", "banana", "orange" };

		// 1st way
		List<String> arrayList = Arrays.asList(array);

//        //2nd way
//        List<String> arrayList = new ArrayList<>(Arrays.asList(array));

		System.out.println(arrayList);
	}
}
