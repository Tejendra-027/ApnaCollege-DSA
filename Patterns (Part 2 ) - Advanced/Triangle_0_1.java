public class Triangle_0_1 {



    public static void Triangle0_1(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i;j++){
                if ((i+j) % 2 == 0){
                    System.out.print(" 1 ");
                }else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Triangle0_1(5);
    }
}
