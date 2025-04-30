         
         // Type Promotion in Expresions
/*

 1. java automatically promotes each byte,short,or char operand to int
    when evaluting an expression.

 2. if one operand is long,float or double the whole expression is 
    promoted to long,float,or double respectively.

*/


public class TypePromotionInExpression {
    public static void main(String[] args) {
        
        //case 1
        char a = 'a';
        char b = 'b';
        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println(b-a);


        //case 2
        int c = 10;
        float d = 20.20f;
        long e = 256;
        double f = 30;
        double ans = c + d + e + f;
        System.out.println(ans);
    }
}
