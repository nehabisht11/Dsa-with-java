import java.util.Arrays;


public class inbltsrt {
    public static void main(String args[]){
        int arr[]= { 5,3,2,4,1};
       // Arrays.sort(arr);// output 1,2,3,4,5
    Arrays.sort(arr,0,4);
        System.out.println(Arrays.toString(arr));
}
}
