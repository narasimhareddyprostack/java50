package streamApiFinal;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class PrefixwithNumber {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(4);
		list.add(14);
		list.add(44);
		list.add(54);
		list.add(444);
		
		 list.stream().map(num->String.valueOf(num))
		             .filter(num ->num.startsWith("4"))
		             .collect(Collectors.toList())
		             .forEach(num -> System.out.println(num));
	}

}
