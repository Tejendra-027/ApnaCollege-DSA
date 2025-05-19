public class PrintSubArray {
    // Print Sub Array - a continuous part of array

    public static void printSubarray(int number[]){
        int TSA = 0;
        for(int i = 0; i<number.length; i++){
            int start = i;
            for(int j=i; j<number.length;j++){
                int end = j;
                for(int k = start ; k<=end ; k++){ //print
                    System.out.print(number[k]+" "); //subarray
                }
                TSA ++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays = " +TSA);
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        printSubarray(number);
    }
}
