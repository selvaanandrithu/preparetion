package preparation;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
//ConcurrentModifierException
public class ConcurrentModExp {
	
	public static void main(String[] args) {
		
		Map<Integer,String>a=new ConcurrentHashMap<>();
		//Map<Integer,String>a=new HashMap<>();
		a.put(2, "Hello");
		a.put(5, "Hi");
		a.put(8, "welcome");
		
		for(String x:a.values()) {
			System.out.println(x);
			a.put(10, "Bye");
		}
		
		
	}

}
