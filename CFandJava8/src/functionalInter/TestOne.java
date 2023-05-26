package functionalInter;

@FunctionalInterface
interface TestIOne{
	
	public abstract int sum(int a, int b);
	
}
	
public class TestOne implements TestIOne{

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	public static void main(String[] args) {
		TestIOne t1 = new TestOne();
		System.out.println(t1.sum(10, 20));
		
	}

}
