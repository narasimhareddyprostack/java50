package mapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx6 {

	public static void main(String[] args) {
		
		Map<Integer,String> emp=new HashMap<Integer, String>();
		
		
		emp.put(101,"Rahul");
		emp.put(102,"Sonia");
		emp.put(103,"Priyaka");
		emp.put(104,"Modi");
		emp.put(105,"Siddu");
		
		Set s1 = emp.entrySet();
		
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry e=(Entry)itr.next();
			//System.out.println(e.getKey() + ":"+e.getValue());
			e.setValue("Abhishek");
		}
		System.out.println(emp);
		
	}

}
