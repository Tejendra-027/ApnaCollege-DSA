import java.util.*;
public class NumberIsPrimeOrNot {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :-  ");
        int number = sc.nextInt();

        boolean isPrime = true;
        for(int i = 2 ; i <= Math.sqrt(number) ; i++ ){
            
            if(number % i == 0){
                isPrime = false;
            }
        }

        if(isPrime == true){
            System.out.println("prime number");
        } else {
            System.out.println("not prime number");
        }
    }
}
