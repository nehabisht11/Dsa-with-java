import java.util.*;
public class caalbbyvvalue {
    public static void swap(int a,int b){
        int temp =a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println( b);//call by value means parameter makes copy of argumnets changes done inside the function defination
       
    }
    public static void main(String[]args){
        // swap - value exchange
        int a= 3;
         int b= 5;
         swap(a,b); 
        // System.out.println(a);
         //System.out.println( b);
        
    }
    }

    

