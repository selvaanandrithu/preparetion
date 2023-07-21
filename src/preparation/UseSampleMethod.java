package preparation;

public class UseSampleMethod {
	
	public static void main(String[] args) {
		HelloMethodRef c = new HelloMethodRef();
		SampleMethod s = c::sample;
		int[] num = {18,45,98,8,76,23,12};
		s.findHigh(num);
		
	}

}
