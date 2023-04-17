class DefaultValues{
    int a ; //instance var
    static  int b; //static

    public static void main(String[] args) {
        int c; //local variable
        DefaultValues obj1 = new DefaultValues();  

        System.out.println(b);   //0
        System.out.println(DefaultValues.b);   //0
        System.out.println(obj1.b);   //0
        System.out.println(obj1.a);   //0

    }
}