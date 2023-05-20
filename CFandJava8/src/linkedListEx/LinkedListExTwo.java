package linkedListEx;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExTwo {

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
		System.out.println(ll);
		//Collections.sort(ll);
		Collections.shuffle(ll);
		System.out.println(ll);
		
	}

}
