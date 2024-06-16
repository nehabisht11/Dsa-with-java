public class checkkpprimeenumbber {
   /*  public static  boolean isprime(int n){
       for(int i=2;i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }*/
    public static  boolean isprime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
             if(n%i==0){       //optimized way
                 return false;
             }
         }
         return true;
        } 
         public static void primeinrange(int n){
            for(int i =2;i<=n;i++){
                if(isprime(i)){
                    System.out.println(i);
                }
            }
            System.out.println();
         }

    public static void main(String[]args){
       // System.out.println(isprime(6));
       primeinrange(24);

    }
    
}
