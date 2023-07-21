package preparation;

public class Sample {
	
	public static void main(String[] args) {
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		Sample s3 = new Sample();
		
		System.out.println(Sample.a);
//		System.out.println(Sample.a);
//		System.out.println(Sample.a);
//		System.out.println(Sample.a);
	Sample.print();
	}
	
	static int a=10;
	public Sample() {
		a++;
		System.out.println(a);
	}
	static {
		System.out.println("ADDAMS");
	}
	public static void print() {
		System.out.println("This is static method");
	}

}
