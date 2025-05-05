public class DecimailToBinary {

public static void DecToBin(int n){
    int myNum = n;
    int bin = 0;
    int pow = 0;
    int rem;
    while(n>0){
        rem = n%2;
        bin = bin + (rem*(int)Math.pow(10, pow));
        pow++;
        n=n/2;

    }
    System.out.println("Binary form of " +myNum+ " = " +bin );
    
}
    public static void main(String[] args) {
        DecToBin(7);
    }
}
