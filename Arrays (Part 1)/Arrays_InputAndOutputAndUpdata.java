import java.util.*;

public class Arrays_InputAndOutputAndUpdata {
    
    public static void main(String[] args) {


        int marks[] = new int[100];
        
        // How to find the length of an array
        
        System.out.println("length of array = " +marks.length);

        // input and output of an array

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt(); // phy
        marks[1] = sc.nextInt(); // chem
        marks[2] = sc.nextInt(); // math

        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("math : " + marks[2]);

        // updation of marks 

        // marks[2] = marks[2] + 1; 
        // System.out.println("math : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage = " + percentage + "%");
    }

}
