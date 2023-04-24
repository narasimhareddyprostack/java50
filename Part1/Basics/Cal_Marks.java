class Test{
    public static void cal_Marks(int[] marks){
        int total_Marks=0;
        for(int i=0;i<=marks.length-1;i++){
            total_Marks +=marks[i];
        }
        System.out.println("Total Marks: "+ total_Marks);
    }
    public static void main(String[] args) {
        cal_Marks(new int[]{35,36,37,38,39,40});
    }
}