// Brute Force

public class MaxSubarraySum_1 {

    public static void maxSubarraySum(int number[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE; 

        for(int i = 0;i<number.length;i++){
            for(int j = i; j<number.length;j++){
                currSum = 0;
                for(int k = i; k<=j; k++){
                    currSum += number[k];
                }
                System.out.println(currSum);
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = "+maxSum);
    }

    public static void main(String[] args) {
        int nummber[] = {2,4,6,8,10};
        maxSubarraySum(nummber);

    }
}