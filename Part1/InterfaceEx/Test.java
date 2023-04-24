interface Account{
    int min_Bal=500;
    void open_Account();
}
class AccountImpl implements Account{
  public void open_Account(){
    System.out.println("Account Opened Successfully");
  }
}
public class Test{
    public static void main(String[] args) {
         Account  ref=new AccountImpl();
         ref.open_Account();
        System.out.println(AccountImpl.min_Bal);
    }
}

/*
 * interface variable - by default public static final
   public : we can  access any where
   static : without creating object we can access
   final  : modification not allowed
 * 
 */