package preparation;

public class StringClass {
	public static void main(String[] args) {
//		String Literal
		String a = "hello";
		String b = "hello";
		String v = new String("hello");
		System.out.println(a);

		a = a.concat(b);
		System.out.println(a.hashCode());

//		hashcode() is used to find the memory address of value
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(v.hashCode());

//		new keyword
		String a1 = new String("hai");
		System.out.println(a1.hashCode());

		System.out.println(a1);

		StringBuffer b1 = new StringBuffer("raja");
		System.out.println(b1.append("roja"));

		StringBuffer b5 = new StringBuffer("raja");
		System.out.println(b5.reverse());

		StringBuilder c = new StringBuilder("java");
		System.out.println(c.reverse());

		StringBuilder c1 = new StringBuilder("java");
		System.out.println(c1.append("code"));

		String p = "vasianand";
		for (int i = p.length() - 1; i >= 0; i--) {
			System.out.print(p.charAt(i));
		}

	}

}
