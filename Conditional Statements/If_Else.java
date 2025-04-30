import java.util.*;

public class If_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age :- ");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("Adults");
        } if(age > 13 && age < 18 ){
            System.out.println("Teenager");
        } else{
            System.out.println("Not Adults");
        }
    }
}
