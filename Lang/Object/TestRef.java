class Test{
        public static void main(String[] args) {
           Test t1=new Test();
           Test t2=new Test();
           System.out.println(t1); //Test@867896
           System.out.println(t2); //Test@978979
           String s1= new String("Rahul");
           String s2= new String("Rahul");
           System.out.println(t1.equals(t2)); //false
           System.out.println(s1.equals(s2)); //

        }
}