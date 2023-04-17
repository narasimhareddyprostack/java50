class Rule{
    public static void main(String[] args) {
        final int x = 10;
        x++;  //CT error , final variable
        //int y = 5++;  // CT Error 
        //int z = (x++)++; //CT Error

    }
}