package preparation;

import java.util.Arrays;
import java.util.List;

public class ArraytoArraylist {

	public static void main(String[] args) {

		String[] f = { "japan", "india", "srilanaka" };
		List<String> a = Arrays.asList(f);
		a.forEach(x->System.out.println(x));
		
			}

}
