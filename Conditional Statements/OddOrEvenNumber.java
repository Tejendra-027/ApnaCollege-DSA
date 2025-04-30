import java.util.*;

public class OddOrEvenNumber {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }
}
