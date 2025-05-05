import java.util.*;
// Q - write a program that read a set of integers, and then prints the sum of the even and odd integers

// for loop

// public class Loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the range of Integer: ");
//         int n = sc.nextInt();
//         int evensum = 0;
//         int oddsum = 0;
        
        
//         for (int i = 1; i <= n; i++) {
//             System.out.print("Enter number " + i + ": ");
//             int value = sc.nextInt() ;

//             if(value % 2 == 0){
//                 evensum = evensum + value;
//             } else{
//                 oddsum = oddsum + value;
//             }
//         }
//         System.out.println("Sum of even numbers: " + evensum);
//         System.out.println("Sum of odd numbers: " + oddsum);
//     }
// }

// while loop 

// public class Loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the range of Integer :- ");
//         int n = sc.nextInt();
//         int evenNum = 0;
//         int oddNum = 0;

//         while (n>0) {
//             System.out.print("Enter the number :- ");
//             int currNum = sc.nextInt();

//             if(currNum % 2 == 0){
//                 evenNum = evenNum + currNum;
//             } else{
//                 oddNum = oddNum + currNum;
//             }

//             n--;
//         }
//         System.out.println("Sum of even number is " + evenNum);
//         System.out.println("Sum of even number is " + oddNum);

//     }
// }


// Q -  Write a program to find the factorial of any number entered by the user.

    // public class Loop {
    
    //     public static void main(String[] args) {
    //         Scanner sc = new Scanner(System.in);
    //         System.out.print("Enter the number :- ");
    //         int n = sc.nextInt();
    //         int factSum = 1; 
    //         int myNum = n; 

    //         while (n>0) {
    //             factSum = factSum * (n);
    //             n--;
    //         }
    //         System.out.println("So,factorial of " +myNum+ "! = "+factSum);
    //     }
    // }


// Q - Write a program to print the multiplication table of a number N, entered by the user.

// public class Loop {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number :- ");
//         int num = sc.nextInt();
//         int myNum = num; 
//         int value = 1; 
//         int i = 1;

//         while (i<=10) {
//             value =   (num * i);
//             System.err.println(myNum+" * " + i + " = " +value);
//             i++;
//         }

        
//     }
// }


// Q - Write a program to find Prime Number

public class Loop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2; i <= n-1; i++){
            if (n % i == 0){
                isPrime = false;
            }
        }

        if (isPrime == true) {
            System.out.println("Number is Prime");
        } else{
            System.out.println("Number is Not Prime");
        }
    }
}





