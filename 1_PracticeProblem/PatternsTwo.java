// Q - reverse half triangle 

// public class PatternsTwo {

//     public static void ReverseTriangle(int n){
//         for(int i = n; i >= 1 ; i--){
//             for(int j = 1 ; j <= n-i ; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1 ; j <= i  ; j++ ){
//                 System.out.print("*");
                
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         ReverseTriangle(5);
//     }
// }


// Method 2 - using nested for loop

// public class PatternsTwo {

//     public static void Reverse_Triangle(int n){
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= i - 1; j++){
//                 System.out.print(" ");
//             }

//             for(int j = 1; j <= n-(i-1); j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Reverse_Triangle(5);
//     }
// }


// Q - half triangle

// public class PatternsTwo {

//     public static void Half_Triangle(int n){
//         for(int i = 1; i <= n; i++){
//             for(int j = 1 ; j <= n-i ; j++){ 
//                 System.out.print(" ");
//             }

//             for(int j = 1; j <= i ; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Half_Triangle(5);
//     }
// }


// Q - pyramid pattern

// public class PatternsTwo {

//     public static void Pyramid(int n){
//         for(int i = 1; i <= 5;i++){

//             for(int j = 1; j <= n-i ; j++){
//                 System.out.print(" ");
//             }

//             for(int j = 1; j <= i ; j++){
//                 System.out.print(j);
//             }

//             for(int j = i-1 ;j >= 1; j--){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Pyramid(5);
//     }
// }


// Q - write a code for this pattern
//     1 
//    2 3 
//   4 5 6 
//  7 8 9 10 

// public class PatternsTwo {

//     public static void SpacePyramid(int n ){
//         int num = 1;
//         for(int i = 1; i <= n ; i++){
//             for(int j = 1; j <= n - i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1 ;j <= (2*i)-i ;j++){
//                 System.out.print(num + " ");
//                 num++;
                
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         SpacePyramid(4);
//     }
// }


// Q - write a code for butterfly pattern

public class PatternsTwo {

    public static void Butterfly(int n ){
        for(int i = 1; i <= n; i++){
            for(int j = 1 ; j<=i;j++){
                System.out.print("*");
            }

            for(int j = 1; j <= 2 * (n-i) ; j++){
                System.out.print(" ");
            }

            for(int j = 1 ; j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i = n ; i >= 1; i--){

            for(int j = 1 ; j<=i;j++){
                System.out.print("*");
            }

            for(int j = 1; j <= 2 * (n-i) ; j++){
                System.out.print(" ");
            }

            for(int j = 1 ; j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        
        }
    }
    

    public static void main(String[] args) {
        Butterfly(4);
    }
}
