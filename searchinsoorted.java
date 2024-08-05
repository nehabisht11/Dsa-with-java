public class searchinsoorted {
    public static boolean staircasesearch (int matrix[] [],int key){
        int row = 0 ,col = matrix[0].length - 1;
        while ( row < matrix.length && col>=0){
            if (matrix[row][col]==key){
                System.out.println("key found at(" + row + ", "+ col + ")");
                return true;
            }
            else if (key<matrix[row][col]){
                col--;
            }
            else {
                row++;
            }
        }

System.out.println("key id not found");
return false;
    }
    public static void main(String args[]){
        int matrix [][] ={{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {14,15,16,17}};
       staircasesearch(matrix,16);
        
    }
    
}
