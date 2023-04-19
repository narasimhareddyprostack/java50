interface DaoInterF{
   void login();
   void logout();
}
public class DaoImpl implements DaoInterF{
   public void login(){
        System.out.print("DaoImpl - login () method");
   }
   public void logout(){
        System.out.print("DaoImpl - logout () method");
   }
   public static void main(String[] args) {
         DaoImpl obj=new DaoImpl();
         obj.login();
         obj.logout();
   }
}
