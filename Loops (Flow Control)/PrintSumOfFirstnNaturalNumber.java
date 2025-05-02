import java.util.*;

public class PrintSumOfFirstnNaturalNumber {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Number :- ");
        int n = sc.nextInt();
        int number = 1;
        int counter = 0 ;

        while (number <= n) {
            counter = counter +  number;
            number++;
        }

        System.out.println(counter);
        
    }
}
