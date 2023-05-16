package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
	public static void main(String[] args) {
	ArrayList<String> enames=new ArrayList<String>();
	enames.add("Rahul");
	enames.add("Sonia");
	enames.add("Priyanka");
	enames.add("Modi");
	enames.add("DK Siva");
	
	System.out.println(enames);
	/*
	for(String ename:enames) {
		System.out.println(ename);
	}
	*/
	int i=0;
	while(i<=enames.size()-1) {
		System.out.println(enames.get(i));
		i++;
	}
		
		
		
	}
}
