public class factorialllbincoff {
    public static int factorial(int n){
        int f =1;
        for(int i=1;i<=n;i++) {
            f= f * i;
        }
            return f;
            
        }
        public static int bincoff(int n ,int r){
            int fact_n= factorial(n);
            int fact_r =factorial(r);
            int fact_nmr = factorial(n-r);
            int bincoff = fact_n/(fact_r * fact_nmr);
            return bincoff;
        }
    public static void main(String[]args){
    int fac =factorial(4);
    System.out.println(fac);
    int bincof= bincoff(5,2);
    System.out.println(bincof);
    }
}
    

