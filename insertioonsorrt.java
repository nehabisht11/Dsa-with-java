public class insertioonsorrt {
    public static void insertionsort( int arr[]){
        for( int i = 1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >=0 && arr[prev] > curr){
            arr[prev +1] = arr[prev];
            prev--;
            }
            arr[prev+1] = curr;

            }
        }
        public static void printArr( int arr[]){
            for(int element : arr){
                System.out.println(element + " ");
            }
    }
    public static void main(String args[]){
        int arr[]= { 6,7,8,4,3,2,1,5};
        insertionsort(arr);
        printArr(arr);
        
    }
    
}
