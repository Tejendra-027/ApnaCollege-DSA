public class InvertedAndRotatedHalfPyramid {

    public static void HalfPyramid(int tolRows , int tolCols ){
        for(int i=1 ; i<= tolRows ; i++ ){
            for(int j = 1 ;j <= tolRows - i ;j++){
                System.out.print(" ");
            } 

            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
                
            }
            System.out.println();
            
        }
       
    }
    public static void main(String[] args) {
        HalfPyramid(4,4);
    }
}



