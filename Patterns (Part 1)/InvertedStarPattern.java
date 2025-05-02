// Method - 1

// public class InvertedStarPattern {
//     public static void main(String[] args) {
//         for(int line = 1 ; line <= 4; line++){
//             for(int star = 4 ; star >= line; star--){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//     }
// }



// Method - 2

public class InvertedStarPattern {
    public static void main(String[] args) {
        int n = 4;
        for(int i=1 ;i <= 4 ; i++){
            for(int j=1 ; j<=n-i+1;j++ ){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}


