package preparation;

import java.util.Arrays;
import java.util.List;

public class ArraylisttoArray {
	public static void main(String[] args) {
		
		
//		List<String>tr=Arrays.asList("selva","anand","sibi","manikandan","sriman","selvam");
//		String [] a = tr.toArray(new String[tr.size()]);
//		for(String x:a) {
//			System.out.println(x);
//		}
		
		List<Integer>gf = Arrays.asList(45,55,65,65,76,89,54,76);
		Integer [] v = gf.toArray(new Integer[0]);
		for (Integer f:v) {
			System.out.println(f);
		}
		
	}

}
