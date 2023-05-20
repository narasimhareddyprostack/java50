package setEx;

import java.util.HashSet;

public class HashSetEx2 {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>(200, 0.90f);
		
		hs.add("Rahul");
		hs.add("Sonia");
		hs.add("Priyanka");
		hs.add("Modi");
		hs.add("A Shaw");
		
		
		System.out.println(hs);
		
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains(null));
		
		for(Object obj:hs) {
			System.out.println(obj);
		}
	}
}
