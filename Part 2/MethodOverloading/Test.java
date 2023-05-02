class Test{
    public void m1(){
        System.out.println("m1() method-zero arguments");
    }
    public int m1(int a){
        System.out.println("m1() method-integer arguments");
        return 10;
    }
    public void m1(String s){
        System.out.println("m1() method-String arguments");
    }
    public static void main(String[] args) {
        Test a1=new Test();
        a1.m1();
        a1.m1(10);
        a1.m1("Rahul");

    }
}
/*
 * method signature meanns 
 * method name and no of arguments
 * method signature is same means - overloading
 */