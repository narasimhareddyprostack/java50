class Emp{
    int eId;
    String eName;
    double eSal;
    static String e_OrgName="TCS";
    public static void main(String[] args) {
        Emp e1=new Emp();
        Emp e2=new Emp();
        Emp e3=new Emp();
        e1.eId = 101;
        e2.eId = 102;
        e3.eId  = 103;
        e1.eName = "Rahul";
        e2.eName = "Sonia";
        e3.eName = "Priyanka";
        e1.eSal = 45000.00;
        e2.eSal = 55000.00;
        e3.eSal = 65000.00;

        System.out.println(e1.eSal); //45
        System.out.println(e2.eSal); //55
        System.out.println(e3.eSal);  //65
        System.out.println(e1.e_OrgName); //TCS
        System.out.println(e2.e_OrgName); //TCS
        System.out.println(e3.e_OrgName); //TCS
    }
}