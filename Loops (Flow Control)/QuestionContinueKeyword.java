// Q - display all number entered by user except multiples of 10

import java.util.*;
public class QuestionContinueKeyword {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :- ");
        int number = sc.nextInt();
        
        
        for(int i = 1 ; i<=number ; i++ ){
            if(i % 10 == 0){
                continue;
            }
            System.out.println(i);
        }
        
    }
}
