class FundsExcption extends Exception{
    FundsExcption(String msg){
        super(msg);
    }
}
class Account{
    public void checkBal() throws FundsExcption{
        throw new FundsExcption("Check Bal");
       /*  try{
            throw new FundsExcption("Check Bal");
        }
        catch(Exception e){
            e.printStackTrace();
        } */
        System.out.println("GM");
        System.out.println("GA");
        System.out.println("GN");
    }
    public static void main(String[] args)  throws FundsExcption{
        new Account().checkBal();

    }
}
