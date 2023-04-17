class Test{
    int a = 10;
    static  int b = 20;

    public static void main(String[] args) {
        int c = 30;
        Test obj1=new Test();
        Test obj2=new Test();
        obj1.a=100;
        obj1.b=200;
        System.out.println(obj1.a);  //100
        System.out.println(obj1.b);  //200
        System.out.println(obj2.a);  //10
        System.out.println(obj2.b);   //200

    }
}