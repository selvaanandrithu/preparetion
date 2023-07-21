package preparation;

public class FinalizeConnect {
	public static void main(String[] args) {
		Finalize s1 = new Finalize();
		System.out.println(s1.hashCode());
		s1=new Finalize();
		System.out.println(s1);
		System.gc();
	}

}
