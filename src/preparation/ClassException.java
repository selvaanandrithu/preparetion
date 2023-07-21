package preparation;

public class ClassException {

	public static void main(String[] args) {
		
		String[] a = {"sun","moon","star"};
		
		try {
		
		System.out.println(a[0].charAt(5));
		
		
	}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e+" It is A StringIndexOutOfBoundsException");
			e.printStackTrace();
		}
		catch (RuntimeException r) {
		System.out.println(r);
		}
		catch(Exception f) {
			System.out.println(f);
		}
		finally {
			System.out.println("i was born to win");
		}

}
}
