package lambdaex;

interface TestSum{
		public abstract int sum(int a, int b);
}
public class TestAdd  {
	static TestSum t1 = (a,b)->a+b;
	
	public static void main(String[] args) {
		//TestSum t1=(a,b)->a+b;
		//TestSum t1=(int a, int b)->{ return a+b; };
		System.out.println(t1.sum(10, 20));
	}	



	
}
