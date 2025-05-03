public class FindBinomialCofficient {

    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i<=n ; i++){
            f = f*i;
        }
        return f;
    }

    public static int BinoCoff(int n , int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fac_nmr = factorial(n-r);

        int BinomialCofficient = fact_n / (fact_r * fac_nmr);
        return BinomialCofficient;
    }
    public static void main(String[] args) {
        System.out.println(BinoCoff(5, 2));
    }
}
