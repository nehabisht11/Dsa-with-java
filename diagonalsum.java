public class diagonalsum {
    public static int diagonallsum (int matrix [][]){
        int sum =0 ;
<<<<<<< HEAD
        for(int i = 0 ; i<matrix.length;i++){
=======
        for(int i = 0 ; i<=matrix.length;i++){
>>>>>>> e9ceaf41cfda58a78de1e9db726e61bbde23dfce
            //pd
            sum+=matrix[i][i];
            //sd
            if(i!=matrix.length-1-i){
            sum +=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    
    public static void main(String args[]){
        int matrix [][] ={{1,2,3,4},
                           {5,6,7,8},
                          {9,10,11,12},
                          {14,15,16,17}};
<<<<<<< HEAD
     System.out.println(diagonallsum(matrix));
=======
     diagonallsum(matrix);
>>>>>>> e9ceaf41cfda58a78de1e9db726e61bbde23dfce
    }
    
}
