import java.util.*;

// Q - Chaeck odd and even number

// public class Function {
    
//     public static boolean isEven( int n ){
//         if(n%2==0){
//             return true;
//         }else {
//             return false;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         boolean result = isEven( n );
//         System.out.println(result);

//     }
// }


// Q - Sum of digit of number

// public class Function {

//     public static int CalSum( int n ){
//         int counter = 0;
//         while(n>0){
//             int lastDigit = n % 10 ;
//             counter = counter + lastDigit;
//             n = n/10;
//         }
//         return counter;
//     }

//     public static void main(String[] args) {
//         int result = CalSum(22);
//         System.out.println(result);
//     }
// }


// Q - Reverse of a number

// public class Function {

//     public static int Reverse( int n ){
//         int counter = 0;
        

//         while(n>0){
//             int lastDigit = n%10;
//             counter =  counter * 10 + lastDigit ;
//             n = n/10;  
//         }
//         return counter; 
//     }

//     public static void main(String[] args) {
//         int result = Reverse(103);
//         System.out.println(result);
//     }
// }


// check number is palindrome or not



// public class Function {

//     public static int  palindrome(int num){
//     int checkNumber = 0;
//     int originalNumber;
//     originalNumber = num ;

//     while (num>0) {
//         int digit = num%10;
//         checkNumber =  checkNumber * 10 + digit ;
//         num = num / 10;
//     }

//     if (originalNumber == checkNumber) {
//         System.out.println("Yes it is palindrome");
//     }else{
//         System.out.println("not it is palindrome");
//     }

//     return checkNumber;
    
// } 


//     public static void main(String[] args){
//         int result = palindrome(121);
//         System.out.println(result);
//     }
// }



// check if a number is prime or not prime

public class Function {

    public static void isPrime(int num){
        int counter = 0; 
        for(int i = 1 ; i <= num ; i++){
            if( num % i == 0 ){
                counter ++;
            }
        }
        if(counter == 2 ){
            System.out.println("The number is prime");
        } else{
            System.out.println("The number is not prime");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :- ");
        int num = sc.nextInt();
        isPrime(num);

    }
}