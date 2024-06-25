public class trappedrainwater {
    public static int trappedwater(int height[]){
        // calculate leftmax boundary - arrray
         int n = height.length;
        int leftmax[]=new int [n];
        leftmax[0]= height[0];
                for(int i=1; i<n;i++){
            leftmax[i] =Math.max(height[i], leftmax[i-1]);

        }
         // calculate right max boundary - arrray
        int rightmax[]=new int [n];
        leftmax[n-1]= height[n-1];
        for(int i=n-2; i>=0;i--){
            rightmax[i] =Math.max(height[i], leftmax[i+1]);

        }
        int trappedwater = 0;
        //loop
        for(int i =0; i<n; i++){
            //waterlevel = min ( leftmax bound ,rightmax bound)
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            // trapped water= watrelevel - height[i]
            trappedwater += waterlevel - height[i];
                    }
                    return trappedwater;
    }
    public static void main(String args[]){
        int height[] ={4,2,0,6,3,2,5 };
        System.out.println(trappedwater(height));

    }
    
}
