import java.util.*;
public class PrintNumberFrom1ToN {
    public static void main(String[] args){
        System.out.print("Enter the value of number :- ");
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        int number = 1;

        while( number <= counter ){
            System.out.println(number);
            number++ ;
        }
    }
}
