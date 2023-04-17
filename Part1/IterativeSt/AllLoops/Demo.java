/*
 * WAP to print 100 to 1
 * intilization St:  int i=100
 * conditional  St:  i>=1
 * incr/decr    St:  i--;
 */
class Test{
    public static void main(String[] args) {

       /*  for(int i=100; i>=1; i--){
            System.out.println(i);
        } */
      /*   int i=100;
        while(i>=1){
            System.out.println(i);
            i--;
        } */

        int i=100;
        do{ 
            System.out.println(i);
            i--;

        }
        while(i>=1);
    }
}