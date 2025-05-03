public class CheckPrimeWithOptimizedMethod {

    public static boolean IsPrime(int n){
        boolean IsPrime = true;
        for(int i=2 ; i<=Math.sqrt(n) ;i++ ){
            if(n % i == 0){
                IsPrime = false;
            }
        }
        return IsPrime;
    }
    public static void main(String[] args) {
        System.out.println(IsPrime(7));
    }
}
