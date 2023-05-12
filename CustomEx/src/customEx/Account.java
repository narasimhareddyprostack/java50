package customEx;

public class Account {
	public void checkBal() {
		int amount = 5000;
		if(amount > 10000) {
			System.out.println("Go To Goa");
		}
		else {
			throw new FundsException("Stay Here and practice");
		}
		
	}
	public static void main(String[] args) {
		Account a =new Account();
		a.checkBal();
	}

	
}
