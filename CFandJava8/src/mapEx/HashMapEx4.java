package mapEx;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx4 {

	public static void main(String[] args) {
		
		Map<Integer,String> empMap=new HashMap<Integer, String>();
		
		
		empMap.put(101,"Rahul");
		empMap.put(102,"Sonia");
		empMap.put(103,"Priyaka");
		empMap.put(104,"Modi");
		empMap.put(105,"Siddu");
		System.out.println(empMap);
		empMap.put(101, "Rahul Gandhi");
		System.out.println(empMap);
		
	}

}
