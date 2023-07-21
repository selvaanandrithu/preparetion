
package preparation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UseStreamStudent {
	public static void main(String[] args) {
		
	

	StreamStudent s1 = new StreamStudent("varun", 27, 'A', "male");
	StreamStudent s2 = new StreamStudent("mourian", 26, 'A', "male");
	StreamStudent s3 = new StreamStudent("kathiravan", 27, 'B', "male");
	StreamStudent s4 = new StreamStudent("logesh", 23, 'B', "male");
	StreamStudent s5 = new StreamStudent("ganapathy", 25, 'A', "male");
	StreamStudent s6 = new StreamStudent("samala", 28, 'A', "female");
	StreamStudent s7 = new StreamStudent("vijay", 24, 'c', "male");

	List<StreamStudent> s = Arrays.asList(s1, s2, s3, s4, s5, s6, s7);
	
	
	// sorted
	List<String> f = s.stream().map(x->x.getName()).sorted().collect(Collectors.toList());
              //  f.forEach(x->System.out.println(x));
                
    List<String>fg = s.stream().map(x->x.getName()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    //fg.forEach(x->System.out.println(x));
    
    //Distinct
    List<Character>fgh=s.stream().map(x->x.getSection()).distinct().collect(Collectors.toList());
    //fgh.forEach(x->System.out.println(x));
    
    
    //limit
    List<String>fghj=s.stream().map(x->x.getName()).sorted().limit(3).collect(Collectors.toList());
    //fghj.forEach(x->System.out.println(x));
    
    //filter
    List<StreamStudent>fghjk=s.stream().filter(x->x.getName().contains("v")).toList();
    //fghjk.forEach(x->System.out.println(x));
    
    //map
    List<String>fghjkl=s.stream().filter(x->x.getName().contains("v")).map(x->x.getName()).toList();
   // fghjkl.forEach(x->System.out.println(x));
    
    //max
    Integer q=s.stream().map(x->x.getAge()).max(Integer::compareTo).get();
    //with whole obj
    StreamStudent q1=s.stream().max(Comparator.comparing(StreamStudent::getAge)).get();
    //System.out.println(q);
   // System.out.println(q1);
    
    //min
    Integer qw1=s.stream().map(x->x.getAge()).min(Integer::compareTo).get();
    //with whole obj
    StreamStudent qw=s.stream().min(Comparator.comparing(StreamStudent::getAge)).get();
   // System.out.println(qw);
   // System.out.println(qw1);
    
    //second highest
    Integer qwe=s.stream().map(x->x.getAge()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
    //System.out.println(qwe);
    
    //count
    Long qwer=s.stream().map(x->x.getName()).count();
   // System.out.println(qwer);
    
    //Anymatch
    boolean qwert=s.stream().anyMatch(x->x.getGender().equals("female"));
   // System.out.println(qwert);
    
    //summingInt
    Integer qaz=s.stream().collect(Collectors.summingInt(x -> x.getAge()));
   // System.out.println(qaz);
    
    //groupinBy
    Map<Character, List<StreamStudent>> qsc=s.stream().collect(Collectors.groupingBy(StreamStudent::getSection));
   // System.out.println(qsc);
    
    //toset
    Set<StreamStudent> bv=s.stream().collect(Collectors.toSet());
    s.forEach(x->System.out.println(x));
    
    //tomap
    Map<String,StreamStudent> vd = s.stream().collect(Collectors.toMap(x->x.getName(),y->y));
//    vd.forEach((x,y)->System.out.println(x));
//    vd.forEach((x,y)->System.out.println(y));
    
}
}
