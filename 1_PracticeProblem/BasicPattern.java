// Q - Square Pattern

// public class BasicPattern {

//     public static void Square(int n, int m){
//         for(int i = 1; i <= n ; i++){
//             for(int j = 1; j <= m; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
    
//     public static void main(String[] args) {
//         Square(4, 8);
//     }
// }


// Q - Bottom Left Triangle

// public class BasicPattern {

//     public static void BLT(int n){
//         for(int i = 1 ; i <= n; i++){
//             for(int j = 1 ; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         BLT(5);
//     }
// }

// --- Method - 2 

// public class BasicPattern {

//     public static void BLT(int n){
//         for(int i = 1 ; i <= n; i++){
//             for(int j = 1 ; j <= n; j++){
//                 if(i - j >= 0){
//                     System.out.print("*");
//                 } else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         BLT(5);
//     }
// }



// Q - top Left Triangle

// public class BasicPattern {

//     public static void TLT(int n){
//         for(int i = 5 ; i >= 1; i--){
//             for(int j = 1 ; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         TLT(5);
//     }
// }


// // --- Method - 2

// public class BasicPattern {

//     public static void TLT(int n){
//         for(int i = n ; i >= 1; i--){
//             for(int j = 1 ; j <= n; j++){
//                 if(i-j >= 0){
//                     System.out.print("*");
//                 } else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         TLT(5);
//     }
// }


// --- Method - 3

// public class BasicPattern {

//     public static void TLT(int n){
//         for(int i = 1 ; i <= n; i++){
//             for(int j = 1 ; j <= n; j++){
//                 if(i+j <= n+1){
//                     System.out.print("*");
//                 } else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         TLT(5);
//     }
// }




// Q - Count triangle

// public class BasicPattern {

//     public static void CT(int n){
//         for(int i = 1 ; i <= n; i++){
//             for(int j = 1 ; j <= i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         CT(5);
//     }
// }


// Q - Floyd's triangle

// public class BasicPattern {

//     public static void CT(int n){
//         int count = 1;
//         for(int i = 1 ; i <= n; i++){
//             for(int j = 1 ; j <= i; j++){
//                 System.out.print(count);
//                 count++;
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         CT(5);
//     }
// }


// Q - hollow square

// public class BasicPattern {

//     public static void HS(int n){
//         for(int i = 1 ; i <= n; i++){
//             for(int j = 1 ; j <= n; j++){
//                 if(i==1||i==n||j==1||j==n){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         HS(5);
//     }
// }


// Q - Bottom right triangle

// public class BasicPattern {

//     public static void BRT(int n){
//         for(int i = 1 ; i <= n; i++){
//             for(int j = 1 ; j <= n-i; j++){
//                System.out.print(" ");
//             }

//             for(int j = 1 ; j <= i ; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         BRT(5);
//     }
// }

// --- Method - 2

// public class BasicPattern {

//     public static void TLT(int n){
//         for(int i = n ; i >= 1; i--){
//             for(int j = 1 ; j <= n; j++){
//                 if(i-j <= 0){
//                     System.out.print("*");
//                 } else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         TLT(5);
//     }
// }


// --- Method - 3

public class BasicPattern {

    public static void TLT(int n){
        for(int i = 1 ; i <= n; i++){
            for(int j = 1 ; j <= n; j++){
                if(i+j >= n+1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TLT(5);
    }
}



// Q - Top right triangle

// public class BasicPattern {

//     public static void TRT(int n){
//         for(int i = 1 ; i <= n; i++){
//             for(int j = 1 ; j <= i-1; j++){
//                System.out.print(" ");
//             }

//             for(int j = 1 ; j <= (n-i)+1 ; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         TRT(5);
//     }
// }


// --- Method - 2


// public class BasicPattern {

//     public static void TRT(int n){
//         for(int i = 1 ; i <= n; i++){
//             for(int j = 1; j <= n; j++){
//                 if( i-j >= 1 ){
//                     System.out.print(" ");
//                 } else{
//                     System.out.print("*");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         TRT(7);
//     }
// }



// Q - X pattern

// public class BasicPattern {

//     public static void TRT(int n) {
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 // Print * at the diagonals
//                 if (j == i || j == n - i + 1) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(); // Move to next line after each row
//         }
//     }

//     public static void main(String[] args) {
//         TRT(5);  // You can change the size here
//     }
// }
