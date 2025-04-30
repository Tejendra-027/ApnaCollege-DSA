import java.util.*;

public class PrintTheLargestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of A :- ");
        int A = sc.nextInt();

        System.out.print("Enter the value of B :- ");
        int B = sc.nextInt();

        System.out.print("Enter the value of C :- ");
        int C = sc.nextInt();

        if((A>B) && (A>C)){
            System.out.println("A is largest");
        } else if (B > C){
            System.out.println("B is largest");
        } else{
            System.out.println("C is largest");
        }
    }
}
