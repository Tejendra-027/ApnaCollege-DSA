public class PrimeInRange {
    
    public static boolean isPrime(int n){
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    
    public static void PrimeInRange(int n){ 
        for(int i=2;i<=n;i++ ){
            if(isPrime(i)==true){ //true
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PrimeInRange(20);
    }
}
