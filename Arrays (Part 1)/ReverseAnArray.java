public class ReverseAnArray {
    // Reverse an Array

    public static void reverseArrat(int number[]){
        int first = 0 ;
        int last = number.length - 1 ;
        int temp ;

        while(first < last){
            // swap
            temp = number[last] ;
            number[last] = number[first] ;
            number[first] = temp ;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        reverseArrat(number);

        for(int i = 0; i < number.length;i++){
            System.out.print(number[i] + " ");
        }
    }
}
