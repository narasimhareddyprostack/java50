package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		List al1=new ArrayList();
		List al2=new ArrayList();
		al1.add(10);
		al1.add(10.5);
		al1.add("Rahul");
		
		al2.add(10);
		al2.add(20);
		
		al1.addAll(al2);
		
		System.out.println(al1);
		System.out.println(al2);
		
		
	}
}
