package preparation;

import java.util.Hashtable;

public class HashTablePreparation {
	
	public static void main(String[] args) {
		
		Hashtable<Integer, String> mm = new Hashtable<>();
		
		mm.put(101,"nisha");
		mm.put(105, "jothia");
		mm.put(107, "gopi");
		mm.put(1001, "kumar");
		
		for(Integer x :mm.keySet()) {
//			for(String x:mm.values()) {
//			System.out.println(x);
			System.out.println(x+" "+mm.get(x));
			//System.out.println(x.hashCode());
			//System.out.println(x.hashCode()%10);
		}
		
		
	}

}
