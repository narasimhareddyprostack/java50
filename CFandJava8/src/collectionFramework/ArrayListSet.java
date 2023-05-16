package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSet {
	public static void main(String[] args) {
		List al=new ArrayList();
		al.add(10);//0
		al.add(20);//1
		al.add(30);//2
		al.add(40);//3
		al.set(2, 25);
		System.out.println(al);
		
		al.clear();
		System.out.println(al);
	}
}
