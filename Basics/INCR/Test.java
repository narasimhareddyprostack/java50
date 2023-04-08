//++x  : pre incr means first incr then first assignment 
class Test{
  public static void main(String[] args) {
    int x = 10;
    int y = ++x;
    System.out.println(x); //11
    System.out.println(y); //11
  }
}