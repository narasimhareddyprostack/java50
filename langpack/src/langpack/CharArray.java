package langpack;

public class CharArray {
	public static void main(String[] args) {
		CharArray obj =new CharArray();
		char[] ch1 = {'a','b','c'};
		int[] ids = {101,102,103};
		
		System.out.println(ids);
		System.out.println(ch1);
		System.out.println(ch1.toString());  // abc
		System.out.println(obj);  //[CharArray@abc423432
	}
}
