public class InvertedHalfPyramidWithNumber {

    public static void printPattern(int n){
        int fixNum = n; 
        // outer loop - rows
        for(int i = 1; i <= n; i++){
            // inner loop - number
            for(int j = 1; j <= fixNum-i+1 ;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern(5);
    }
}
