public class duplicatelement {
    public static boolean duplicated(int number[]){
        for( int i=0;i<number.length;i++){
            for(int j =i+1;j<number.length;j++ ){
                if(number[i]==number[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String margs[]){
        int number[] = {2,5,3,4,4,8,9};
        System.out.println(duplicated(number));

    }
    
}
