class Employee {
   int emp_Id;
   String emp_Name;
   double emp_Sal;
   Employee(int id, String name, double sal) {
        this.emp_Id = id;
        this.emp_Name = name;
        this.emp_Sal = sal;
    }
    public String get_Details(){
        return this.emp_Id+":"+this.emp_Name;
    }
    public static void main(String[] args) {
    Employee  e1= new Employee(101,"Rahul",45000.00);
    System.out.println(e1.get_Details());
    System.out.println(e1);
       
    }
}