package preparation;

public class UseSampleFunctional {

	public static void main(String[] args) {

		SampleFunctional s = (a) -> {
			for (int i = 0; i < a.length; i++) {
				if((a[i]%3==0) && (a[i]%2!=0)){
					System.out.println(a[i]);
					
				}

			}

		};
		int[] v = {1,2,3,4,5,6,7,8,9,12,23,45,67,89,91};
		s.find(v);
	}

}
