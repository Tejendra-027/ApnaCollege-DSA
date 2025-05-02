// // Q - Keep entering numbers till user enter a multiples of 10


import java.util.*;
public class QuestionBreakKeyword {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter your number :-  ");
            int n = sc.nextInt();
            System.err.println(n);

            if(n%10 == 0){
                break;
            }
        }while(true);
    }
}
