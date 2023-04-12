class Test{
    int a = 10;  //instance var
    static  int b = 20; //static

    public static void main(String[] args) {
        int c = 30; //local variable
        Test obj1 = new Test();  
        System.out.println(b);   //20
        System.out.println(Test.b);   //20
        System.out.println(obj1.b);   //20

    }
}