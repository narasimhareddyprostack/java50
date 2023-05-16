package collectionFramework;

import java.util.List;
import java.util.ArrayList;

public class TestOne {
	public static void main(String[] args) {
		List al=new ArrayList();
		al.add("vasu");//0
		al.add("Rahul");//1
		al.add(10);//2
		al.add("Naveen");//3
		System.out.println(al);
		for(int i=0; i<=al.size()-1;i++) {
			setValue(i,al.get(i));
		}
		//System.out.println(al);
	}

	private static void setValue(int i, Object object) {
		if()
		System.out.println( object);
		
	}
}
