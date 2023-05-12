package customEx;

public class Check {
	public static void main(String[] args) {
		try {
			String ename=null;
			System.out.println(ename.length());
		}
		catch(NullPointerException ne) {
			ne.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
