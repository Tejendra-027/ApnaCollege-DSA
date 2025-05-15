public class HollowRectanglePattern {
    
    public static void hollow_rectangle(int tolRows, int tolCols){
        //outer loop - rows
        for(int i = 1; i <= tolRows; i++){
            //inner loop - columns
            for(int j = 1; j <= tolCols; j++){
                // cell - (i,j)
                if(i == 1 || i == tolRows || j == 1 || j == tolCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
     hollow_rectangle(4, 5);   
    }
}
