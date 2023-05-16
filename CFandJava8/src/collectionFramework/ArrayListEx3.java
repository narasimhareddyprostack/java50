package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx3 {
	public static void main(String[] args) {
	ArrayList<String> enames=new ArrayList<String>();
	enames.add("Rahul");
	enames.add("Sonia");
	enames.add("Priyanka");
	enames.add("Modi");
	enames.add("DK Siva");
	
	System.out.println(enames);
	
	Collections.sort(enames);
	System.out.println(enames);	
	
	//String a  = Collections.sort(enames); 

	
	//Collections.shuffle(enames);
	//System.out.println(enames);	
		
		
	}
}
