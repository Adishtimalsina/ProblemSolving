import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //int[] array = {1,2,3,4,5,6,7,8,9};
        int[] array = {1,1,2};

        //
        ReverseArray reverseArray = new ReverseArray();
       // reverseArray.reverseArray(array);

        //
        FindMinInArray findMinInArray = new FindMinInArray();
        //System.out.print(findMinInArray.findMin(array));

        //
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        System.out.print(removeDuplicate.removeDuplicates(array));
    }
}
