import java.util.*;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the case number :- ");
        int number = sc.nextInt();

       switch (number) {
        case 1:System.out.println("samosa");
            break;
        
        case 2:System.out.println("burger");
            break;

        case 3:System.out.println("mango shake");
            break;     
       
        default: System.out.println("we wake up");
            break;
       }
    
    }
}
