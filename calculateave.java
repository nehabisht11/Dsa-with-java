import java.util.*;
public class calculateave {
    public static double ave(double a,double b,double c){
return(a+b+c)/3.0;
    }
    public static void main(String []args){
      /*  double a=3.4;
        double b=4.5;
        double c=2.2;
        double ave = ave(a,b,c);
        System.out.println(ave);*/
 //-------------------------------------------------------------------------------------------------------
        //input from user
        Scanner sc =new Scanner (System.in);
        System.out.println("enter the first number");
        double a=sc.nextDouble();
        System.out.println("enter the second number");
        double b=sc.nextDouble();
        System.out.println("enter the second number");
        double c=sc.nextDouble();
        double ave = ave(a,b,c);
        System.out.println(ave);
    }   
}
