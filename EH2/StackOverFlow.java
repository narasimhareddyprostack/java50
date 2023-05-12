class Test{
    public static void main(String[] args) {
        methodOne();
    }
    public static void methodOne(){
        methodTwo();
    }
    public static void methodTwo(){
        methodOne();
    }
}