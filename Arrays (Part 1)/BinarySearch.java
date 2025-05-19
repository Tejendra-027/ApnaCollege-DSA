public class BinarySearch {

    // Binary Search - Prerequisite sorted arrays

    public static int binarySearch(int number[], int key){
        int start = 0; 
        int end = number.length-1;

        while(start <= end ) {
            int mid = (start + end ) / 2 ;

            // comparisions

            if(number[mid] == key){  //found
                return mid;
            }
            if(number[mid] < key){  // right - 2 half
                start = mid + 1;
            } else {                // left - 1 half
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10, 12, 14}; 
        int key = 10;

        System.out.println("index for key is :- " +binarySearch(number, key));
    }
}
