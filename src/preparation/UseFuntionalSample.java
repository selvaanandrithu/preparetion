package preparation;

public class UseFuntionalSample {
	
	public static void main(String[] args) {
		
		FuntionalSample s = (a,b) -> {
			if(a>b) {
				return a+" is High";
			}
			else {
				return b+" is High";
			}
			
			
		};
		System.out.println(s.findHigh(5, 10));
	}

}
