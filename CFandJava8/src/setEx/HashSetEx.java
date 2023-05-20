package setEx;

import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet hs=new HashSet(200, 0.90f);
		hs.add(10);
		hs.add(10);
		hs.add(10);
		hs.add(10);
		hs.add("Rahul");
		hs.add(true);
		hs.add(500.5);
		hs.add('Y');
		hs.add(null);
		System.out.println(hs);
		
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains(null));
		
		for(Object obj:hs) {
			System.out.println(obj);
		}
	}
}
