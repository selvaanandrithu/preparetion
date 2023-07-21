package preparation;

import java.util.Arrays;
import java.util.List;

public class UseSamFunlist {
	public static void main(String[] args) {
		
		SamFunlist s =(a) -> {
			for(int i=0;i<a.size();i++) {
				if(a.get(i).contains("a")||a.get(i).contains("e")||a.get(i).contains("i")||a.get(i).contains("o")||a.get(i).contains("u")) {
					continue;
				}
				else {
					System.out.println(a.get(i));
				}
			}
			
		};
		List<String> f = Arrays.asList("ct","selva","anand","farida","loosi","ksp","slty","systm");
		s.find(f);
		
	}

}
