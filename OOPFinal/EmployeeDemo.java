class Employee{
    int emp_Id;
    String emp_Name;
    String emp_Email;
    Employee(int a,String b,String c){
        this.emp_Id=a;
        this.emp_Name=b;
        this.emp_Email=c;
    }
}
class PE extends Employee{
    int no_Leaves;
    PE(int id,String name,String email,int no_Leaves){
        super(id,name,email);
        this.no_Leaves=no_Leaves;
    }
}
public class EmployeeDemo{
    public static void main(String[] args) {
        PE e1=new PE(101,"Rahul","rahul@gmail.com",4);
        System.out.println(e1.emp_Id);
        System.out.println(e1.emp_Name);
        System.out.println(e1.emp_Email);
        System.out.println(e1.no_Leaves);

    }
}