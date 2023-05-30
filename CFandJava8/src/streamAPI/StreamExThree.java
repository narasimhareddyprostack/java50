package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExThree {

	public static void main(String[] args) {
		List<String> enames=new ArrayList<>();
		enames.add("Abhi");
		enames.add("Vasu");
		enames.add("Rahul");
		enames.add("Ramesh");
		enames.add("Naveen");
		enames.add("Sonia");
		enames.add("Gautham");
		enames.add("Vamsi");
		enames.add("Mrunal");
		enames.add("Priyanka");
		
		/*
		List<String> names= enames.stream()
	      .filter(name-> name.startsWith("R"))
	      .collect(Collectors.toList());
		
		System.out.println(names);
		for(String name:names) {
			System.out.println(name);
		}
		*/
		/*
		enames.stream()
		      .filter(name-> name.startsWith("R"))
		      .collect(Collectors.toList())
		      .forEach(name->System.out.println(name));
		*/
		long no_Enames = enames.stream()
				.filter(name->name.startsWith("R"))
				.count();
		System.out.println(no_Enames);
		
	}

}
