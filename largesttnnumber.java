public class largesttnnumber {

    public static int largestnumber(int number[]){
        //int largest= Integer.MIN_VALUE;
       // for(int i=0;i<number.length;i++){
           // if(largest<number[i]){
            int largest= Integer.MAX_VALUE;
           for( int i =0;i<number.length ;i++){
            if( largest>number[i]){
           
                largest = number[i];

            }
        }
        return  largest;

    }
    public static void main(String args[]){
        int number[]  = {4,8,9,4,2};
       // System.out.println( "largest number = " + largestnumber(number) );
       System.out.println( "smallest number = " + largestnumber(number) );
    }

    
}
