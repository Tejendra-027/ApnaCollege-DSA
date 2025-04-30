
                        // # Type Casting
             
                        /* 
                        
                        int marks = (int)(99.99f) 


        #. Narrowing Type Casting (Explicit Casting)
                    
        1   Also called downcasting.

        2   Manually converting a larger data type into a smaller data type.

        3   Can cause data loss or unexpected behavior.

        4   Requires a cast operator.



        Example ---->


        public class Main {
        public static void main(String[] args) {
        double x = 10.5;
        int y = (int) x;  // double to int (manual)
        System.out.println(y);  // Output: 10 (decimal part lost)
    }
}

                        
                        */

import java.util.*;
public class TypeCasting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // case 1
        float a = 25.99999f;
        int b = (int) a;
        System.out.println(b);

        // case 2
        char ch = 'a';
        char ch2 = 'b';
        int number = ch;
        int number2 = ch2;
        System.out.println(number);
        System.out.println(number2);
    }
}
