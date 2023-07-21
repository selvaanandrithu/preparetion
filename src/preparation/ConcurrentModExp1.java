package preparation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModExp1 {
	
	public static void main(String[] args) {
		
		List<String>a=new CopyOnWriteArrayList<>();
		//List<String>a=new ArrayList<>();
		a.add("hello");
		a.add("hi");
		a.add("welcome");
		a.add("hakuna matata");
		
		for(String x:a) {
			//System.out.println(x);
			a.remove("hello");
			a.add("wow");
		}
		a.add("plan");
		a.forEach(x->System.out.println(x));
		System.out.println(a);
	}
	
	//FailFast & FailSafe

}
