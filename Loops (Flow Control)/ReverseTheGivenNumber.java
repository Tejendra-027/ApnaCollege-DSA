import java.util.*;

// public class ReverseTheGivenNumber {
//     public static void main(String[] args) {
//         int n = 2003;
//         int rev = 0;

//         while(n > 0){
//             int lastDigit = n%10;
//             rev = (rev * 10) + lastDigit;
//             n = n / 10;
//         }
//         System.out.println(rev);
//     }    
// }


public class ReverseTheGivenNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number : ");
        int a = sc.nextInt();
        int rev = 0;
        for(int n=a; n>0; n = n/10){
            int lastDigit = n%10;
            rev = (rev * 10) + lastDigit;
        }
        System.out.println(rev);
    }
}

