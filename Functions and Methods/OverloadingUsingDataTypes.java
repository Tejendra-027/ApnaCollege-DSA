public class OverloadingUsingDataTypes {
    // func to cal int sum
    public static int Sum(int a , int b){
        return a+b;
    }
    //func to cal float sum
    public static float Sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(Sum(5,3));
        System.out.println(Sum(3.5f,4.5f));
    }
}
