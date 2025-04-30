import java.util.*;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        
    
        if(income <= 500000){
            System.out.println("Pay Zero Tax");
        } else if (income > 500000 && income <= 1000000 ){
            float tax = income * (0.2f);
            System.out.println(tax);
        } else{
           float tax = income*(0.3f);
           System.out.println(tax);
        }
    }
}
