import java.util.*;
public class arrayy {
    public static void main(String args[]){
        int marks[] = new int [100];
        Scanner sc =  new Scanner (System.in);
        marks[0] =sc.nextInt();
        marks[1] =sc.nextInt();
        marks[2] =sc.nextInt();
        System.out.println( "phy : " +  marks[0]);
        System.out.println( "che :"+ marks[1]);
          System.out.println("maths :"+  marks[2]); 
          //percentage
          int percentage =(marks[0]+marks[1]+marks[2])/3;
          System.out.println("percentage ="+ percentage);
          //length of array
          System.out.println(marks.length);

    }

}
