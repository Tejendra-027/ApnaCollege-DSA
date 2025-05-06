// Q - write a java program to print rectangle pattern

// public class Pattern {
//     public static void main (String[] args){
        
//         for(int i = 0;i < 4; i++){
//             for(int j = 0; j < 5; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// Q - Write a Java program that prints a number pattern using nested loops. The program should print 6 rows and 3 columns of sequential numbers starting from 1

// public class Pattern {

//     public static void main(String[] args) {
        
//         int n = 6;
//         int m = 3;
//         int num = 1 ;
//         for(int i = 0; i < n; i++){
//             for(int j = 1; j <= m; j++){
//                System.out.print(num + " ");
//                num++;
//             }
            
//             System.out.println();
//         }
//     }
// }


// Q - Write a Java program using nested loops to print the following right-angled triangle pattern with asterisks (*), where the number of rows is 5:

// public class Pattern {

//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 1 ; i <= n ; i++ ){
//             for(int j = 1; j<=i ;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// Q - Write a Java program that prints an inverted right-angled triangle pattern of asterisks (*) with 5 rows.

// public class Pattern {

//     public static void main(String[] args){
//         int n = 5;

//         for(int i = n; i>=1 ; i--){
//             for(int j = 1 ; j<=i ; j++ ){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// method - 2

// public class Pattern {

//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 1 ; i <= n ;i++ ){
//             for(int j = 1 ; j<=n-i+1 ; j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }


// Q - Q: WAP (Write a Java Program) to print the following pattern

// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *


// public class Pattern {

//     public static void main(String[] args) {
//         int n = 5; 
//         int z = 4;
//         for(int i = 1; i <= n; i++  ){
//             for(int j = 1 ; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();

//             if(i==5){
//                 for(int c = 1 ; c <= z ;c++ ){
//                     for(int d = 1 ; d<=z-c+1 ; d++){
//                         System.out.print("*");
//                     }
//                     System.out.println("");
//                 }
//             }
//         }
//     }
// }


// method - 2 

// public class Pattern {

//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 1; i <= n ;i++ ){
//             for(int j = 1 ; j <= i ; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         for(int i = 1; i<=n-1 ; i++){
//             for(int j = 1 ; j<=n-i  ; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// Q - Q: Write a Java program to print the following right-aligned triangle pattern using asterisks (*):
//     *
//    **
//   ***
//  ****


// public class Pattern {

//     public static void main(String[] args) {
//         int n = 4; // number of rows

//         for (int i = 1; i <= n; i++) {
//             // Print spaces
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             // Print stars
//             for (int k = 1; k <= i; k++) {
//                 System.out.print("*");
//             }

//             System.out.println(); // Move to next line
//         }
//     }
// }







