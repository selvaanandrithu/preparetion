package preparation;

public class Mourian {

	int[] a;
	int temp = a[0];

	public void checkvalue(int[] v) throws NumberException {

		//int temp = a[0];

		for (int i = 1; i < a.length; i++) {
			
			if (a[i] < temp) {
				temp = a[i]; // Update lowest if a smaller value is found
				System.out.println(a[i]);
			}

			try {
				if (a[i] < a[0] && a[i] < 100) {
					throw new NumberException("its high");
				} else {
					System.out.println(a[i]);
				}

			} catch (Exception e) {
				System.out.println(e);
			}

		}

	}
}
