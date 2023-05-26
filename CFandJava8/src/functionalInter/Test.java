package functionalInter;

@FunctionalInterface
interface TestI{
	public abstract void m1();
}
public class Test implements TestI{

	public void m1() {
		
		System.out.println("Test Class - m1 method");
	}
	public static void main(String[] args) {
		Test t1=new Test();
		t1.m1();
	}

	

}
