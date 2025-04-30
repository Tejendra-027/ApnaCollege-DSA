import java.util.*;

public class InputInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*  // take single word input
        String input = sc.next();
        System.out.println(input); */

        // take paragraph as input
        String name = sc.nextLine();
        System.out.println(name);

        int number = sc.nextInt();
        System.out.println(number);

        float price = sc.nextFloat();
        System.out.println(price);

        double penprice  = sc.nextDouble();
        System.out.println(penprice);

        long copyprice = sc.nextLong();
        System.out.println(copyprice);

        boolean var = sc.nextBoolean();
        System.out.println(var);

        //nextByte();

        //nextShort();
    }
}
