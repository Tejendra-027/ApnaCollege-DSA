public class LargestInArray {
    // find the largest number in a given array

    public static int getLargest(int number[]){
        int Largest = Integer.MIN_VALUE; // -infinity
        int Smallest = Integer.MAX_VALUE; // +infinity
        for(int i = 0; i < number.length; i++){
            if(number[i] > Largest){ // largest < number[i]
                Largest = number[i];
            }

            if(number[i] < Smallest){ // smallest > number[i]
                Smallest = number[i];
            }
        }
        
        System.out.println("Smallest value is :- " + Smallest);
        return Largest;
    }


    public static void main(String[] args) {
        int number[] = {1, 2, 6, 3, 5};
        int Largest = getLargest(number);
        System.out.println("Largest value is :- " + Largest);
    }
}
