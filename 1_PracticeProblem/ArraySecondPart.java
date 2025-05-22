// Q --- 33. Search in Rotated Sorted Array

// public class ArraySecondPart {

//     public static int rotatedSortedArray(int nums[], int target){
//         int n = nums.length;
//         int low = 0;
//         int high = n-1;

//         while(low <= high ){
//             int mid = (low+high) / 2; 
//             if(target == nums[mid]){
//                 return mid;
//             }

//             // Left half is sorted
//             else if(nums[low] <= nums[mid]){ 
//                 if(target >= nums[low]  && target <= nums[mid]){
//                     high = mid - 1;
//                 } else{
//                     low = mid + 1;
//                 }
//             }

//             // Right half is sorted
//             else {
//                 if (target > nums[mid] && target <= nums[high]) {
//                     low = mid + 1;
//                 } else {
//                     high = mid - 1;
//                 }
//             }    
            
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int nums[] = {4,5,6,7,0,1,2};
//         int target = 0;
//         int finalValue = rotatedSortedArray(nums,target);
//         System.out.println(finalValue);
//     }
// }




// Q ---- Trapping Rain Water -- Brute Force Method

// Time Complexity -- O(N^2)

// idea 

// for(int i = 1 ; i = i<=N-2 ; i++ ){

//     for(int j = i-1 ; j >=0; j-- ){
//         int LeftMax = find left max;
//     }

//     for(int j = i+1 ; j <=n; j++){
//         int RightMax = find Right max;
//     }

//     int Min = min(LeftMax , RightMax);
    
//     ans += Min - arr[i];
// }




// public class ArraySecondPart {
//     public static int trap(int[] height) {
//         int n = height.length;
//         int waterTrapped = 0;

//         for (int i = 0; i < n; i++) {
//             int leftMax = 0, rightMax = 0;

//             // Find maximum height to the left of i
//             for (int j = 0; j <= i; j++) {
//                 leftMax = Math.max(leftMax, height[j]);
//             }

//             // Find maximum height to the right of i
//             for (int j = i; j < n; j++) {
//                 rightMax = Math.max(rightMax, height[j]);
//             }

//             // Water trapped at current index
//             waterTrapped += Math.min(leftMax, rightMax) - height[i];
//         }

//         return waterTrapped;
//     }

//     public static void main(String[] args) {
//         int[] height = {4, 2, 0, 3, 2, 5};
//         System.out.println("Water trapped: " + trap(height)); // Output: 9
//     }
// }



// Second Method 
// Optimize method 
// Time Complexity -- O(N)

// public class ArraySecondPart {

//     public static int trappedRainWater(int arr[]){
//         int N = arr.length;

//         int Leftmax[] = new int[N] ; 
//         Leftmax[0] = arr[0] ;
//         for(int i = 1 ; i < N ; i++){
//             Leftmax[i] = Integer.max(arr[i], Leftmax[i-1]);
//         }

//         int Rightmax[] = new int[N] ; 
//         Rightmax[N-1] = arr[N-1] ;
//         for(int i = N-2 ; i >= 0 ; i--){
//             Rightmax[i] = Integer.max(arr[i], Rightmax[i+1]);
//         }

//         int ans = 0;
//         for(int i = 1; i<=N-2; i++){
//             int Minimum = Integer.min(Leftmax[i], Rightmax[i]); 
//             ans += Minimum - arr[i] ;
//         }

//         return ans;
//     }

//     public static void main(String[] args) {
//         int arr[] = {4,2,0,3,2,5};
//         System.out.println(trappedRainWater(arr));
//     }
// }


// Third Method 
// Optimize method 
// Space Complexity -- O(1)

// public class ArraySecondPart {

//     public static int trap(int arr[]){
//         int n = arr.length;
//         int leftMax = arr[0];
//         int rightMax = arr[n-1]; 

//         int low = 1;
//         int high = n-2;
//         int ans = 0;

//         while(low <= high){
//             leftMax = Math.max(arr[low],leftMax );
//             rightMax = Math.max(rightMax, arr[high]);

//             if(leftMax < rightMax){
//                 ans += leftMax - arr[low];
//                 low++;
//             }

//             else{
//                 ans += rightMax - arr[high];
//                 high--;
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int arr[] = {4,2,0,3,2,5};
//         System.out.println(trap(arr));
//     }
// }



// Q ---> 15 . 3Sum -- leetcode

import java.util.*;

public class ArraySecondPart {

    public static List<List<Integer>> threeSum(int nums[]) {
        int n = nums.length;

        // Step 1: Sort the array to apply two-pointer logic
        Arrays.sort(nums);

        // Use a Set to avoid adding duplicate triplets
        Set<List<Integer>> set = new HashSet<>();

        // Final result list
        List<List<Integer>> result = new ArrayList<>();

        // Step 2: Start from the end of the array (high pointer)
        int high = n - 1;

        // Outer loop: Fix the third element (nums[high]) and find the other two
        while (high >= 2) {

            // Set mid to just before high and low to beginning
            int mid = high - 1;
            int low = 0;

            // Step 3: Use two-pointer approach to find pairs (low, mid)
            while (low < mid) {
                int sum = nums[low] + nums[mid] + nums[high];

                if (sum == 0) {
                    // Found a valid triplet
                    set.add(Arrays.asList(nums[low], nums[mid], nums[high]));

                    // Skip duplicates for both low and mid
                    int lowVal = nums[low], midVal = nums[mid];
                    while (low < mid && nums[low] == lowVal) low++;
                    while (low < mid && nums[mid] == midVal) mid--;

                } else if (sum < 0) {
                    // Need a larger sum → move low pointer to the right
                    low++;
                } else {
                    // Need a smaller sum → move mid pointer to the left
                    mid--;
                }
            }

            // Step 4: Move high pointer leftward, skipping duplicates
            int highVal = nums[high];
            while (high >= 2 && nums[high] == highVal) high--;
        }

        // Add all unique triplets from set to the result list
        result.addAll(set);
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums)); // Output: [[-1, -1, 2], [-1, 0, 1]]
    }
}
