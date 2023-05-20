package linkedListEx;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExOne {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add("Rahul");
		ll.add(50);
		ll.add(null);
		ll.add(null);
		
		
		/*for(Object obj:ll) {
			System.out.println(obj);
		}*/
		
		//System.out.println(ll);
		/*
		for(int i=0;i <=ll.size()-1;i++) {
			System.out.println(ll.get(i));
		}*/
		
		Iterator itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}
