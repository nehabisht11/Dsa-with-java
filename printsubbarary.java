public class printsubbarary {
    public static void printsubarray(int number[]){
        int ts = 0;
        for(int i = 0 ; i<number.length;i++){
            int start = i;
             for(int j= 0 ; j<number.length;j++){
                int end = j;
                for( int k=0 ; k<number.length; k++){
                    System.out.println(number[k]) ;             
                  }
                  ts++;
                  System.out.println();
             }
        }
        System.out.println(" total sub array = " + ts) ;
    }
    public static void main ( String args[] ){
        int number[]= {2,4,6,8,10};
        printsubarray(number);
    }
}
