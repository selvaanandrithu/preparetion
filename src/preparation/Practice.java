package preparation;

public class Practice {
	public static void main(String[] args) {
		
		int[] a= {101,234,56,345,36};
		int v = a[0];
		
		for(int i=0;i<a.length;i++) {
			
	            if (a[i] < v) {
	                v = a[i]; // Update lowest if a smaller value is found
	                
	                
	                System.out.println(a[i]);
	                //break;
	            }
	            //System.out.println(a[i]);
		}

		
	}
	


}
