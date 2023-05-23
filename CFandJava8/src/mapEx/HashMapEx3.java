package mapEx;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx3 {

	public static void main(String[] args) {
		
		Map<Integer,String> emp=new HashMap<Integer, String>();
		
		
		emp.put(101,"Rahul");
		emp.put(102,"Sonia");
		emp.put(103,"Priyaka");
		emp.put(104,"Modi");
		emp.put(105,"Siddu");
		Set s1 = emp.keySet();
		Collection c=emp.values();
	
		for(Object key:s1) {
				System.out.println(key);
		}
		for(Object value:c) {
			System.out.println(value);
		}

	}

}
