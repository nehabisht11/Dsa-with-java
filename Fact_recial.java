public class Fact_recial {
    
    public static void main(String[] args) {
        int ans=fac(5);
        System.out.println(ans);
    }
    public static int fac(int n){
        if ( n == 0){
            return 1;
    
        }
        return n*fac(n-1); 
    
    }
}
