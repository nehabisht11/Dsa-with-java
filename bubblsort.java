public class bubblsort {
    public static  void bubblesort(int number[]){
        for(int turn = 0;turn<number.length-1;turn++){
            for(int i = 0;i<number.length-1-turn;i++){
                if(number[i]>number[i+1]){
                    int temp=number[i];
                    number[i]=number[i+1];
                    number[i+1]=temp;
                }
            }
        } 
    }
        public static void printnumber( int number[]){
            for(int i = 0;i<number.length;i++){
                System.out.println(number[i] + " ");
            }
        }
    public static void main(String args[]){
        int number[] = {5,4,1,3,2};
        bubblesort(number);
        printnumber(number);

    }
    
}
