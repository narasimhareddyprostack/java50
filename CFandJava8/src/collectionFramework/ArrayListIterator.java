package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		ArrayList<String> enames=new ArrayList<String>();
		enames.add("Rahul");
		enames.add("Abhishek");
		enames.add("Bhanu");
		enames.add("Sonia");
		enames.add("Priyanka");
		//System.out.println(enames);
		/*
		for(String ename:enames) {
			System.out.println(ename);
		}*/
		Iterator itr=enames.iterator();
		System.out.println(itr);
		
		/*
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/

	}

}
