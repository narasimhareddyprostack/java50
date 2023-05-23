package mapEx;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		new HashMap(20, 0.9f);
		new HashMap(100, 0.8f);
		Map<Integer,String> empMap=new HashMap<Integer, String>();
		
		System.out.println(empMap);
		empMap.put(101,"Rahul");
		empMap.put(102,"Sonia");
		empMap.put(103,"Priyaka");
		empMap.put(104,"Modi");
		empMap.put(105,"Siddu");
		System.out.println(empMap);

	}

}
