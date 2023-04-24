//Account class is encapulated entity
public class Account{
    private double min_Bal;
    private String acc_Name;
    //      +
    public void set_MinBal(double bal){
        this.min_Bal = bal;
    }
    public double get_MinBal(){
        return min_Bal;
    }

    public void set_AccName(String name){
        this.acc_Name = name;
    }

    public String get_AccName(){
        return acc_Name;
    }
    public static void main(String[] args) {
       Account a1= new Account();
       a1.set_MinBal(500.00);
       a1.set_AccName("Rahul Gandhi");
       System.out.println(a1.get_MinBal());
       System.out.println(a1.get_AccName());
    }
}