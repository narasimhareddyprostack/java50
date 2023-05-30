package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExOne {

	public static void main(String[] args) {
	List<String> enames=new ArrayList<>();
	enames.add("Abhi");
	enames.add("Vasu");
	enames.add("Rahul");
	enames.add("Naveen");
	enames.add("Sonia");
	enames.add("Priyanka");
	List<String> new_Names = new ArrayList<>();
	for(String ename:enames) {
		new_Names.add(ename.toUpperCase());
	}
	System.out.println(new_Names);
	//create stream object and configure and process
	List<String> names= enames.stream()
	      .map(name->name.toUpperCase())
	      .collect(Collectors.toList());
	System.out.println(enames);
	System.out.println(names);
	}

}
