public class FindProductOfAandB {
    public static int Multiply(int a , int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args){
        int a=2 ;
        int b=4 ;
        int prod = Multiply(a, b)  ;
        System.out.print("a*b = " +prod);

    }
}
