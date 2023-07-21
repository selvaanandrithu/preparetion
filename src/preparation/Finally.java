package preparation;

public class Finally {
	public static void main(String[] args) throws CusExp {

		int a = 10;
		int b = 0;

		try {

			System.out.println(a / b);
		} catch (Exception e) {
			System.out.println(e + " its Arithmetic exception");
			e.printStackTrace();
		} finally {
			System.out.println("Finally is a block");
		}
	}
}
