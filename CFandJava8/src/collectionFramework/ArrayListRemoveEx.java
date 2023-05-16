package collectionFramework;

import java.util.List;
import java.util.ArrayList;

public class ArrayListRemoveEx {
	public static void main(String[] args) {
		List al1=new ArrayList();
		List al2=new ArrayList();
		
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		System.out.println(al1);
		System.out.println("****");
		al2.add(10);
		al2.add(10);
		al2.add(10);
		al2.add(10);
		
		System.out.println(al2);
		System.out.println("remove and removeAll");
		
		al1.remove(0);
		al2.remove(0);
		
		System.out.println(al1);
		System.out.println(al2);
		
	}
}
