class All{
    public static void main(String[] args) {
        String[] enames = {"Rahul","Sonai","Priyanka"};
        try{
        //System.out.println(enames[4]);//AIOBSException
        String ename= null;
        System.out.println(ename.length());//NullPointerException
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}