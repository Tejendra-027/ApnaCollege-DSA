                
                
                // # Type Conversion

      /*  Conversion happens when :
         a. type compatiable  
           Example --->  int <--> float   (number to number)          correct
                         int <--> boolean (number to true / false )   worng
        
         b. destination type  >  source type
          Example ---->

            byte -> short -> int -> float -> long -> double
          
      */




import java.util.*;

public class TypeConversion {
    public static void main (String[] args){
        /* case -- 1
        int a = 25;
        long b = a;
        System.out.println(b);
        
        correct type connversion ---> small data --> large data conersion 

        */



        /* case -- 2
        long a = 25;
        int b = a;
        System.out.println(b);
        
        worng type connversion ---> large data --> small data conversion   
        # incompatiable types : possible lossy conversion 

        */


        // example 

        Scanner sc = new Scanner(System.in);
        float number = sc.nextInt();
        System.out.println(number);
    } 
}
