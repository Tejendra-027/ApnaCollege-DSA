public class ArraysAsFunctionArguments {

    // Passing arrays as arguments

    public static void update(int marks[],int nonChangable){
        nonChangable = 10;
        for(int i = 0; i < marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int nonChangable = 5; // value not change
        System.out.println(nonChangable);

        int marks[] = {97, 98, 99};  // value change
        update(marks , nonChangable);

        for(int i = 0; i < marks.length ; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
    
}
