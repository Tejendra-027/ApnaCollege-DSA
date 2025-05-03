// public class CallByValue {
//     public static void main(String[] args) {
//         //swap - value exchange
//         int a = 10;
//         int b = 20;

//         // swap 
//         int temp = a;
//         a = b;
//         b = temp;

//         System.out.println("A = " +a);
//         System.out.println("B = "+b);
//     }
// }


public class CallByValue{

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value change");
        System.out.println("A = " +a);
        System.out.println("B = "+b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a, b);
        System.out.println("value not change");
        System.out.println("A = " +a);
        System.out.println("B = "+b);

    }
}


/* ### Explanation of Output:

Inside the `swap` method, the values are successfully swapped because they are local to that method.

But in the `main` method, the original values remain unchanged.

### Why This Happens:

Java is pass-by-value. That means:

* When you pass variables to a method, **copies** of their values are passed.
* The original values in `main()` are **not changed** by what happens in `swap()`.

So:

* The swap only affects the **copies** inside the method.
* The original variables in `main()` remain unchanged.
 */
