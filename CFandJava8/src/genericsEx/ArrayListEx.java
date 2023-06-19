package genericsEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		//List<Integer> al=new ArrayList<Integer>();
		List al=new ArrayList();
		al.add(100);
		al.add(200);
		System.out.println((Integer)al.get(0)+(Integer)al.get(1));
	}
}
