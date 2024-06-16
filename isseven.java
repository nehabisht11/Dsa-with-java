import java.util.*;
public class isseven {
    public static  boolean iseven(int a){
        if (a % 2 == 0){
        return true;
    }
    return false;
}
    public static void main(String []args){
        //boolean iseven =iseven(4);
        //System.out.println(iseven);
//--------------------------------------------------------------------------------------------------------
        //input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        if(iseven(a)){
        System.out.println("number is even");
        }
        else {System.out.println("number is odd");
        }
        boolean iseven =iseven(a);
        System.out.println(iseven);
    } 
}
