package preparation;

public class Finalize {
	@Override
	public void finalize() {
		System.out.println("collected");
	}

}
