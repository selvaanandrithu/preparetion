package preparation;

import java.util.Arrays;

public class HelloMethodRef {

	public void sample(int[] a) {

		int min = Arrays.stream(a).min().orElseThrow();
		if(min%2==0) {
			System.out.println(min+" is even");
		}
		else {
			System.out.println(min+ " is odd ");
		}

	

	}

}
