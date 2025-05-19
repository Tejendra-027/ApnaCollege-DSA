 import java.util.*;
 
//  // Q - 189 Question of leetCode --> Rotate Array  

// public class ArrayFirstPart {

//     public static void RotateArray(int nums[]){
//         int temp = nums[nums.length - 1] ;
//         for(int i = nums.length - 2; i >= 0 ; i--){
//             nums[i+1] = nums[i] ;
//         }
//         nums[0] = temp;
//     }


//     public static void main (String[] args ) {
//         int nums[] = {1,2,3,4,5,6,7};
//         int k = 3;


//         for(int j  = 0 ; j < k ; j++){
//             RotateArray(nums);
//         }

//         for(int i = 0 ; i < nums.length;i++ ){
//             System.out.print(nums[i] + " ");
//         } 
//     }

// }



// Q -  Array as function arguments

// public class ArrayFirstPart {

//     public static void update(int marks[]){
//         for(int i = 0 ;i < marks.length ;i++){
//             marks[i] = marks[i] + 1;
//         }
//     }

//     public static void main(String[] args){
//         int marks[] = {97,98,99};
//         update(marks);

//         for(int i = 0 ;i < marks.length ;i++){
//             System.out.print(marks[i] + " ");
//         }
//     }
    
// }


// Q - Linear Search

// public class ArrayFirstPart {

//     public static int linearSearch(int nums[], int key){
//         for(int i = 0; i < nums.length ; i++){
//             if(nums[i] == key){
//                 return i ;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int nums[] = {2,4,6,8,10,12,14,16};
//         int key = 10;

//         int checker =linearSearch(nums, key);

//         if(checker == -1){
//             System.out.println("number is not present ");
//         } else{
//             System.out.println("number is present at index "  +checker);

//         }
//     }
// }



// Q - find the largest and smallest number in a given array

// public class ArrayFirstPart {

//     public static int largestNumber(int nums[]){
//         int largest = Integer.MIN_VALUE ;
//         int smallest = Integer.MAX_VALUE;
//         for(int i = 0; i<nums.length; i++){
//             if(nums[i] > largest){
//                 largest = nums[i];
//             }
//             if(nums[i] < smallest){
//                 smallest = nums[i];
//             }
//         }
//         System.out.println("Smallest value is - " +smallest);
//         return largest;
//     } 

//     public static void main(String[] args) {
//         int nums[] = {1,2,6,33,5}; 
//         int findValue = largestNumber(nums);
//         System.out.println("Largest value is - " +findValue);
//     }
// }



// Q - Binary Search

// public class ArrayFirstPart {

//     public static int BinarySearch(int number[] , int key){
//         int start = 0;
//         int end = number.length - 1;

//         while(start <= end){
//             int mid = (start + end ) / 2;

//             if(number[mid] == key){
//                 return mid ; 
//             }

//             if(number[mid] < key){
//                 start = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int number[] = {2,4,6,8,10,12,14};
//         int key = 10;

//         System.out.println("Index for key is " +BinarySearch(number, key));
//     }
// }



// Q - Reverse an Array

// public class ArrayFirstPart {

//     public static void ReverseArray(int nums[]){
//         int start = 0;
//         int last = nums.length-1;

//         while(start < last ){
//             int temp = nums[last];
//             nums[last] = nums[start];
//             nums[start] = temp;

//             start++;
//             last--;
//         }
//     }

//     public static void main(String[] args) {
//         int nums[] = {2,4,6,8,10};
        
//         ReverseArray(nums);

//         for(int i = 0; i < nums.length ;i++ ){
//             System.out.print(nums[i] + " ");
//         }
//     }
// }


// Q - Pairs in an Array

// public class ArrayFirstPart {

//     public static void pairsArray(int nums[] ){
//         int tp = 0;
//         for(int i = 0 ; i < nums.length  ; i++){
//             for(int j = i+1 ; j < nums.length    ;j++){
//                 System.out.print("(" +nums[i]+ ","+nums[j]+")");
//                 System.out.print(" ");
//                 tp ++;
//             }
            
//             System.out.println();
//         }
//         System.out.println("Total Pairs :- " +tp);
//     }
//     public static void main(String[] args) {
//         int nums[] = {2,4,6,8,10};

//         pairsArray(nums);

//     }
// }


// Q - Print Subarray

public class ArrayFirstPart {

    public static void subArray(int nums[]){
        int ts = 0;
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i ; j < nums.length ; j++){
                for(int k=i;k <= j; k++){
                    System.out.print(nums[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArray is :- " +ts);
    }

    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10}; 
        subArray(nums);
    }
}






