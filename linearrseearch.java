public class linearrseearch {
     public static int linearsearch(int number[] ,int key){
        for(int i =0;i<number.length;i++){
            if(number[i]==key){
                return i;

            }
        }
        return -1;
     }
    public static void  main(String args[]){
        int number[] ={12,56,34,67,8,78};
        int key = 56;
       // System.out.println ("index number" + "=" +(linearsearch(number,key)));
       int index = linearsearch( number, key);
       if (index == -1){
        System.out.println("index not found");
       }
        else{
            System.out.println("key is at index = " + index);


        }

       }

    }
    

