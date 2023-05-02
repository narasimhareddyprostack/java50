class Test{
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=10;
        Test t1=new Test();
        Test t2=new Test();
        Test t3 = t1;

        String s1=new String("Rahul Gandhi");
        String s2=new String("Rahul Gandhi");
        String s3=s1;

        System.out.println(a==b); //false
        System.out.println(a==c);  //true

        System.out.println(t1==t2); //false
        System.out.println(t1.equals(t2));//false
        System.out.println(t1.equals(t3));//true
        
        System.out.println("String objects");
        System.out.println(s1.equals(s2));//true
        System.out.println(s1 == s2);//false
        System.out.println(s1 == s3);//true
    }
}