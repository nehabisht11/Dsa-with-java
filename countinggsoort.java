public class countinggsoort {
    public static void countingsort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length; i ++){
        largest = Math.max(largest, arr[i]);
     }
        int count[ ]= new int [largest+ 1];
        for (int i = 0; i <arr.length; i++){
        count[arr[i]]++;
    }
    int j = 0;
    for(int i= 0;i <arr.length;i++){
    while(count[i]>0){
        arr[j]= i;
        j++;
        count[i]--;
    }
  }
}
public static void printArr( int arr[]){
    for(int i = 0;i<arr.length;i++){
        System.out.println(arr[i] + " ");
    }
}
public static void main(String args[]){
    int arr []={1,1,2,3,3,4,5,6,6,7};
    countingsort(arr);
    printArr(arr);
    }
}    



