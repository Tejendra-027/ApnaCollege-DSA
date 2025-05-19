public class PairsInAnArray {
    // Pairs in an Array

    public static void printPairs(int number[]){
        int totalpairs = 0;

        for(int i=0; i<number.length;i++){
            int curr = number[i]; // 2, 4, 6, 8, 10
            for(int j = i+1; j<number.length;j++) {
                System.out.print("(" +curr+ "," + number[j] + ")" );
                totalpairs++;
            } 
            System.out.println();
        }
        System.out.println("Total Pairs :- " + totalpairs);
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        printPairs(number);
    }
}
