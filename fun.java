import java.util.*;
public class fun {
    public static void printhelloworrld(){
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
    }
        public static int calculateSum( int a,int b){//parameters or foraml parameters
            int sum = a + b;
            return(sum);
           
        }
    
        public static void main(String[]args){
            Scanner sc= new Scanner (System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = calculateSum(a,b);  //arguments actual pareameters      
             System.out.println(sum);
 
        }

    }