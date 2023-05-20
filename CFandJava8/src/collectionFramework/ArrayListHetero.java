package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListHetero {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("Rahul");
		al.add(100);
		al.add(true);
		al.add(null);
		al.add(100);
		al.add(true);
		al.add(null);
		System.out.println(al);
		
		for(Object obj:al) {
				System.out.println(obj);
		}	
		
		
	}
}
