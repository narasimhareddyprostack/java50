package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
	public static void main(String[] args) {
		ArrayList<String> enames=new ArrayList<String>();
		enames.add("Rahul");
		enames.add("Abhishek");
		enames.add("Bhanu");
		enames.add("Sonia");
		enames.add("Priyanka");
		System.out.println(enames);
		Collections.sort(enames, Collections.reverseOrder());
		System.out.println(enames);
	}
}
