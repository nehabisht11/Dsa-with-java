public class sortestpth {
    public static float shortetpath( String path){
        int x =0,y =0;
        for(int i  =0; i<path.length();i++){
            char dir = path.charAt(i);
            //south
            if (dir == 's'){
                y--;
            }
            else if (dir == 'n'){
                y++;
            }
            else if ( dir == 'w'){
                x--;
            }
            else if (dir == 'e'){
                x++;
            }
        }   
        int  x2 = x*x , y2 = y * y ;
        return( (float) Math.sqrt(x2 + y2));
    }

    
    public static void main(String args){
        String path ="wwennsswense";
        System.out.println( shortetpath(path));

    }
    
}
