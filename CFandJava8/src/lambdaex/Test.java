package lambdaex;

@FunctionalInterface
interface TestI{
	void m1();
}
public class Test  {
	
	public static void main(String[] args) {
		
	TestI t1 = ()->{
		System.out.println("Hello");
	};
	t1.m1();
		
	}

}
