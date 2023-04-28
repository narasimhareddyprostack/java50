class Account{
    int branch_Id = 256;
    Account(){
         System.out.println("Account Class Constr");
    }
    public void get_Account(){
        System.out.println("Account Class Details");
    }
}

class SA extends Account{
    int branch_Id = 455;
    SA(){
        super(); // invoking parent class const
        super.get_Account(); //invoking parent method
        this.branch_Id =super.branch_Id; // geting parent var
    }
    public void get_Account(){
        System.out.println("SA Class Details");
    }
    public static void main(String[] args) {
            SA a1=new SA();
            System.out.println(a1.branch_Id);
           
           
    }
}