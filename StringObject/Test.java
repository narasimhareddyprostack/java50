class Test{
    public static void main(String[] args) {
       
        String s1 = "Rahul";
        String s2 = new String("Rahul");
        String s3 = new String("Rahul");
        String s4 = "Rahul";

        
        System.out.println(s1 == s2);  //false
        System.out.println(s1 == s3); //false
        System.out.println(s1 == s4); //true
        System.out.println(s2 == s3); //false
        
        System.out.println(s1.equals(s2));//true




    }
}