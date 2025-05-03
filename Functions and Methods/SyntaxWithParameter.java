import java.util.*;
public class SyntaxWithParameter {
    
    public static int CalculateSum(int num1 , int num2){ // parameter or formal parameter
        int sum = num1 + num2;
        return sum;
    }
    
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum =  CalculateSum(a,b); // arguments or actual parameters
        System.out.println("Sum is " + sum);
    }
}
