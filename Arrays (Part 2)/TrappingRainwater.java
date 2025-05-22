// logic 

// calculate left max boundary --> array
// calculate rigth max boundary --> array
// loop 
// waterlevel = min(leftmax boundary , rightmax boundary)
// trapped water = waterlevel - height[i]

public class TrappingRainwater {

    public static int trappingRainWater(int height[] ){
        int n = height.length;

        // calculate left max boundary --> array
        int leftMax[] = new int[n]; 
        leftMax[0] = height[0];
        for(int i = 1; i < n ; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]) ;
        } 

        // calculate rigth max boundary --> array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }  


        // loop
        int trappedWater = 0;
        for(int i = 0; i<n; i++){
            // waterlevel = min(leftmax boundary , rightmax boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trapped water = waterlevel - height[i]  
            trappedWater += waterLevel - height[i];  
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int finalResult = trappingRainWater(height);
        System.out.println(finalResult);
    }
}
