public class FloydsTriangle {

    public static void FloydTriangle(int n){
        // outer
        int count = 1;
        for(int i = 1; i <= n; i++){
            // inner - how many times will counter be printed
            for(int j = 1; j <= i ;j++){
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FloydTriangle(5);
    }
}
