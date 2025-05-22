// Prefix Sum

public class MaxSubarray_2 {

    public static void maxSubarraySum(int nums[]){
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int [nums.length];

        prefix[0] = nums[0];
        // calculate prefix array 
        for(int i = 1  ; i<prefix.length;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        
        for(int i = 1; i<nums.length;i++){
            int start = i;
            for(int j=i;j<nums.length;j++){
                int end = j ;

                int currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max value is :- " +maxSum);
    }

    public static void main(String[] args){
        int nums[] = {1,-2,6,-1,3};
        maxSubarraySum(nums);
    }
}