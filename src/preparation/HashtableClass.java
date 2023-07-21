package preparation;

import java.util.Hashtable;

public class HashtableClass {
	public static void main(String[] args) {
		
		Hashtable<Integer, String> em = new Hashtable<>(10);
		em.put(101, "Niaha");
		em.put(107, "prakash");
		em.put(1001, "Nilla");
		
		for(Integer x:em.keySet()) {
			//System.out.println(x.hashCode()%10);
			//System.out.println(x.hashCode());
			System.out.println(x+" "+em.get(x));
		}
		
	}

}
