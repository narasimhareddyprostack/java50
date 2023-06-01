package streamApiFinal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,10,20,10,30,40,40);
		
		List<Integer> dist_Values=list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(dist_Values);

	}

}
