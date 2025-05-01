import java.util.*;


// Q1 - write a java program to get a number from the user and print whether it is positive or negative.
          
// public class ConditionalStatements {
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter a number :- ");
//         int number = sc.nextInt();

//         if(number > 0){
//             System.out.println(" This is a Positive Number");
//         } else if (number == 0 ) {
//             System.out.println("zero is not a positive or negative number");
//         }else {
//             System.out.println("This is a Negative Number");
//         }
//     }
// }



// Q2 - finish the following code so that it prints you have a fever if your temperature is above 100 and otherwise prints you don't have a fever

// 


// Q3 - leap year 

// method 1
// public class ConditionalStatements{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the year :- ");
//         int year = sc.nextInt();

//         if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
//             System.out.println("This is a leap year");
//         } else {
//             System.out.println("This is not a leap year");
//         }
//     }
// }




// method 2
// public class ConditionalStatements{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the year :- ");
//         int year = sc.nextInt();

//         if((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)){ 
//             System.out.println("This is a leap year");
//         } else if ((year % 4 == 0) && (year % 100 != 0)){ 
//             System.out.println("This is a leap year");
//         } else {
//             System.out.println("This is not a leap year");
//         }
//     }
// }
