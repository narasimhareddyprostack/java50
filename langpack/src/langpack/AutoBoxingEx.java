package langpack;

public class AutoBoxingEx {
	public static void main(String[] args) {
		int a = 10;
		Integer b = a;  //autoboxing
		Integer c = Integer.valueOf(a);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a == b);
		System.out.println(b == c);
		
	}
}
